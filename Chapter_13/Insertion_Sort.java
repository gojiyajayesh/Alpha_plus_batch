/**
 * Insertion_Sort
 */
public class Insertion_Sort {
    public static void insertionSort(int arr[]) {
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j--];
            }
            arr[++j] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 98, 8, 9, 12, 13, 14, 15, 56, 57 };
        System.out.println("Before Sorting");
        for (int i : arr)
            System.out.print(i + " ");
        insertionSort(arr);
        System.out.println("\nAfter Sorting");
        for (int i : arr)
            System.out.print(i + " ");
    }
}