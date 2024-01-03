import java.util.*;
/**
 * Binary_search
 */
public class Binary_search {

    public static void main(String[] args) {
        int arr[]=new int[20];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i;
        }
        System.out.println(search(arr,6));
        }
        public static int search(int[]arr,int key) {
            int i=0;
            int j=arr.length-1;
            while(i<=j)
            {
                int mid=i+((j-i)/2);
                if(arr[mid]==key)
                return mid;
                else if(arr[mid]<key)
                i=mid+1;
                else
                j=mid-1;
            }
            return -1;
        }
}