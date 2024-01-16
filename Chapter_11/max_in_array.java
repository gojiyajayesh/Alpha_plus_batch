/**
 * max_in_array
 */
public class max_in_array {

    public static void main(String[] args) {
        int arr[]=new int[10];
        for(int i=0;i<=9;i++)
        {
            arr[i]=i;
        }
        System.out.println(max(arr));
        }
        public static int max(int arr[])
        {
            int max=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++)
            {
                if(max<arr[i])
                max=arr[i];
            }
            System.out.println(Integer.MAX_VALUE);
            System.out.println(Integer.MIN_VALUE);
                      return max;
        }
}