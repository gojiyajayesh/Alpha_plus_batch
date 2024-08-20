import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };
        List<int[]> list = findMajorityElements(nums);
        for (int[] element : list) {
            System.out.println("Key: " + element[0] + " Value: " + element[1]);
        }
    }

    public static List<int[]> findMajorityElements(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int threshold = arr.length / 3;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > threshold) {
                result.add(new int[] { entry.getKey(), entry.getValue() });
            }
        }

        return result;
    }
}
