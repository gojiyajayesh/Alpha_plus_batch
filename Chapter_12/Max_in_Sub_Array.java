/**
 * Max_in_Sub_Array
 */
public class Max_in_Sub_Array {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 8 };
        sub_Array(arr);
    }

    public static void sub_Array(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int cur_max=0;
        int cur_min=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                cur_max=0;
                cur_min=0;
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                    cur_max+=arr[k];
                    cur_min+=arr[k];
                }
                if(max<cur_max)
                max=cur_max;
                if(min>cur_min)
                min=cur_min;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max Sum of SubArray is :- "+max);
        System.out.println("Min Sum of SubArray is :- "+min);
    }
}