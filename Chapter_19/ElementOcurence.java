public class ElementOcurence {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,8,7,6,5};
        System.out.println(search(arr, 0, 5));
    }
    public static int search(int arr[],int i,int key)
    {
        if(i==arr.length)
        return -1;
        if(arr[i]==key)
        return i;
        return search(arr, i+1, key);
    }
}
