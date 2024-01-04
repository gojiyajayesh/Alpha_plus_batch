/**
 * Kadanse
 * it is not work for all Nagative numbers  
 */
public class Kadanse {

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,12,-3,-4};
        kadanse(arr);
    }
    public static void kadanse(int arr[])
    {
        int cur_sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            cur_sum+=arr[i];
            if(cur_sum<0)
            cur_sum=0;
            max=Math.max(max,cur_sum);
        }
        System.out.println("MAX SUM OF SUB ARRAY IS :-"+max);
    }
}