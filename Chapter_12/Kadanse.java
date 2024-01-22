/**
 * Kadanse
 * it is not work for all Nagative numbers
 */
public class Kadanse {

    public static void main(String[] args) {
        int arr[] = {-1,-2,-3,-4,-5,-6,-7};
        kadanse(arr);
    }

    public static void kadanse(int arr[]) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                cnt++;
        }
        if (cnt == arr.length) {
            int max=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++)
            {
                max=Math.max(max,arr[i]);
            }
            System.out.println("MAX SUM OF SUB ARRAY IS :  " +max);
        } else {
            int cur_sum = 0;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                cur_sum += arr[i];
                if (cur_sum < 0)
                    cur_sum = 0;
                max = Math.max(max, cur_sum);
            }
            System.out.println("MAX SUM OF SUB ARRAY IS : " + max);
        }
    }
}