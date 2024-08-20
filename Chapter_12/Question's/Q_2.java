/**
 * Question_2
 */
public class Q_2 {
    public static void main(String[] args) {
        int arr[] = { 6, 7, 8, 9, 0, 1, 2, 3, 4, 5 };
        System.out.println(search(arr, 0));
    }

    public static int search(int arr[], int key) {
        // find min-element (Index)
        int min_index = minSearch(arr);
        // Find in left Sub Array
        // Find in Right Sub Array
        return Math.max(binarySearch(arr, key, 0, min_index), binarySearch(arr, key, min_index, arr.length - 1));
    }

    // Search Element in Array
    public static int binarySearch(int arr[], int key, int str, int end) {
        while (str <= end) {
            int mid = str + (end - str) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                str = mid + 1;
            }
        }
        return -1;
    }

    public static int minSearch(int arr[]) // Time Complexity is O(logn)
    {
        int start = 0;
        int end = arr.length - 1;
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return mid;
            } else if (arr[mid] >= arr[start] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
