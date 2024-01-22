/**
 * Max_in_Sub_Array_Using_Prefix_Array
 */
public class Max_in_Sub_Array_Using_Prefix_Array {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9};
        Max_in_Sub_Array_Using_Prefix_Array x=new Max_in_Sub_Array_Using_Prefix_Array();
        x.sub_array(arr);
    }
    public  void sub_array(int arr[])
    {
        int cur_max=0,max=Integer.MIN_VALUE;
        int Prefix[]=new int[arr.length];
        Prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            Prefix[i]=Prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            cur_max=0;
            for(int j=i;j<arr.length;j++)
            {
               cur_max=i==0?Prefix[j]:Prefix[j]-Prefix[i-1];
               if(max<cur_max)
               max=cur_max;
            }
        }
        System.out.println(max);
    }
}