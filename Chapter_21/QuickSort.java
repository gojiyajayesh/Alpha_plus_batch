public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }
    public static void print(int []arr)
    {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] arr, int si, int ei) {
        if(si>=ei)
        return;
        int pIndex=partition(arr, si, ei);
        quickSort(arr,si,pIndex-1);
        quickSort(arr,pIndex+1,ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivote = arr[ei];
        int temp;
        int j = si-1;
        for (int i = si; i < ei; i++) {
            if (pivote >= arr[i]) {
                temp = arr[++j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        arr[ei] = arr[++j];
        arr[j] = pivote;
        return j;
    }
}
