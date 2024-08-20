public class HeapSort {
    public static void main(String[] args) {
        int arr[] = {7,6,5,4,3,2,1};
        heapSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void heapify(int[] arr, int parent, int limit) {
        int largest = parent;
        int left = 2 * parent + 1;
        int right = 2 * parent + 2;

        if (left < limit && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < limit && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != parent) {
            swap(arr, largest, parent);
            heapify(arr, largest, limit);
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i >= 0; i--) {
            swap(arr, 0, i);
            heapify(arr, 0, i);
        }
    }
}