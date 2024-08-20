public class LstOccerense {
    public static void main(String[] args) {
int arr[]={1,2,3,4,5,6,7,8,9,7,6,5,4,44,54,5,4,5,4};
System.out.println(lastOcrence(arr, 4, 0));
    }

    public static int lastOcrence(int[] arr, int key, int i) {
        if (i == arr.length)
            return -1;
        int isFound = lastOcrence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key)
            return i;
        return isFound;
    }
}
