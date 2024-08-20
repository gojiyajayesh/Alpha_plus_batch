public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        divied(arr, 0, arr.length - 1);
    }
    public static void print(int []arr)
    {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void divied(int arr[], int si, int ei) {
        if (si >= ei) {
            System.out.println("Return For si="+si+" end="+ei);
            return;
        }
        int mid = si + (ei - si) / 2;
        System.out.println("Left si=" +si+" mid="+mid);
        System.out.println();
        divied(arr, si, mid);
        System.out.println();
        System.out.println("Right si="+(mid+1)+" ei="+ei);
        System.out.println();
        divied(arr, mid + 1, ei);
        System.out.println();
        System.out.println("Merge si="+si+" mid="+mid+" ei="+ei);
        System.out.println();
        merge(arr, si, mid, ei);
        print(arr);
        System.out.println();
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int x = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] > arr[j]) {
                temp[x++] = arr[j++];
            } else {
                temp[x++] = arr[i++];
            }
        }
        while (i <= mid) {
            temp[x++] = arr[i++];
        }
        while (j <= ei) {
            temp[x++] = arr[j++];
        }
        for (i = si, j = 0; j < temp.length; i++, j++) {
            arr[i] = temp[j];
        }
    }
}