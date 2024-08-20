public class MajorityElement {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(majority(arr));
    }
    public static int majority(int arr[])// Only for Positive Number Not for Nagative Number
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            largest=arr[i];
        }
        int feq[]=new int[largest+1];
        for(int i=0;i<arr.length;i++)
        {
            feq[arr[i]]++;
        }
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<feq.length;i++)
        {
            if(max<feq[i]){
            max=feq[i];
            index=i;
            }
        }
        return index;
    }
}
