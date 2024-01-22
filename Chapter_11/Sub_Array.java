/**
 * Sub_Array
 */
public class Sub_Array {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        pair(arr);
    }
    public static void pair(int arr[])
    {
        int cnt=0,d=0;
        int max[]=new int[arr.length*(arr.length+1)/2];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                cnt=0;
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                    cnt+=arr[k];
                }  
                max[d++]=cnt;
                System.out.println();       
            }
            System.out.println();
        }
        for(int i=0;i<max.length;i++)
        {
            System.out.print(" "+max[i]);
        }
    }
}