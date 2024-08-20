public class SortedArray {
    static int cnt=0;
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(sort(arr, 0));
        System.out.println(cnt);
    }

    public static boolean sort(int[] nums, int i) {
        cnt++;
        if (i == nums.length - 2)
            return (nums[i] <= nums[i + 1]);
        return (nums[i] <= nums[i + 1]) && ((nums[i] <= nums[i + 1]))?(sort(nums, i + 1)):false;
    }
}
