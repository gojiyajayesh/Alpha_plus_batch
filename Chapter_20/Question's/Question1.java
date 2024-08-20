public class Question1 {
    public static void main(String[] args) {
        printIndex(new int[]{1,2,3,4,3,2,3,2,3,4,2,23,23,4,2,1,3,2,5}, 0, 2);
    }
    public static void printIndex(int arr[],int index,int key)
    {
        if(arr.length==index)
        return;
        if(arr[index]==key)
        System.out.print(index+" ");
        printIndex(arr, index+1, key);
    }
}
