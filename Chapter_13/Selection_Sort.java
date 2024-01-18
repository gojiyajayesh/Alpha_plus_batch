/**
 * Selection_Sort
 */
public class Selection_Sort {
    public static void selectionSort(int A[]) {
        int minIndex = 0;
        int temp;
        for (int i = 0; i < A.length - 1; i++) {
            temp = A[i];
            minIndex = i;
            for (int j = i+1; j < A.length; j++) {
                if (A[j] < temp)
                    minIndex = j;
            }
            A[i] = A[minIndex];
            A[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 98, 8, 9, 12, 13, 14, 15, 56, 57 };
        System.out.println("Before Sorting");
        for (int i : arr)
            System.out.print(i + " ");
        selectionSort(arr);
        System.out.println("\nAfter Sorting");
        for (int i : arr)
            System.out.print(i + " ");
    }
}