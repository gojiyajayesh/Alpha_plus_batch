/**
 * Bubble_Sort
 */
public class Bubble_Sort {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,98,8,9,12,13,14,15,56,57};
        System.out.println("Before Sorting");
        for (int i : arr)
            System.out.print(i + " ");
            bubbleSort(arr);
        System.out.println("\nAfter Sorting");
        for (int i : arr)
            System.out.print(i + " ");

    }

    public static void bubbleSort(int arr[]) {
        int temp,flag;
        int n = arr.length;
        // loop for all phase (n-1)
        for (int i = 0; i < n - 1; i++) {
            flag=0;  // if no swap is perfomed then it is stop the loop and return array
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {   // if > is change and < is write then this work for descending order
                    flag=1;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(flag==0)
            break;
        }
    }
}