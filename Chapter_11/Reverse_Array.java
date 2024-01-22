/**
 * Reverse_Array
 */
public class Reverse_Array {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        reverse(arr);
        for (int i : arr) {
            System.out.print(" " + i);
        }
    }
    public static void reverse(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }
    }
}