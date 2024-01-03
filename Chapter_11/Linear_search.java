/**
 * Linear_search
 */
public class Linear_search {
    public static void main(String[] args) {
       int arr[]=new int[100];
       for(int i=0;i<=99;i++)
       {
        arr[i]=i;
       } 
       int i=search(arr,78);
       System.out.println(i);
    }
    public static int search(int arr[],int key)
    {
        for(int i=0;i<=99;i++)
        {
            if(key==arr[i])
            return i;
            
        }
        return -1;
    }
}