import java.util.HashMap;

public class LargestSubArraySumZero {
    public static void main(String[] args) {
        int[] arr={15,-2,2,-8,1,7,10,23};
        System.out.println("Largest sub array sum with 0 length is "+largestSubArray(arr));
    }

    public static int largestSubArray(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int sum = 0, length = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                length = Math.max(length, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return length;
    }
}
