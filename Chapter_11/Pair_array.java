/**
 * Pair_array
 */
public class Pair_array {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        pair(arr);
    }
    public static void pair(int arr[])
    {
        int cnt=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("["+arr[i]+","+arr[j]+"]\t");
                cnt++;
            }
            System.out.println();
        }
        System.out.println(cnt);
    }
}