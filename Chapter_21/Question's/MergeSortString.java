public class MergeSortString {
    public static void main(String[] args) {
        String arr[]={"sun", "earth", "mars", "mercury"};
        devied(arr, 0, arr.length-1);
        for(String i:arr)
        {
            System.out.print(i+" ");
        }
    }

    public static void devied(String arr[], int si, int ei) {
        if(si>=ei)
        return;
        // Kam
        int mid = si + (ei - si) / 2;
        devied(arr, si, mid);
        devied(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (!isComppare(arr[i], arr[j])) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for(i=si,k=0;i<temp.length;i++,k++)
        {
            arr[i]=temp[k];
        }
    }
    public static boolean isComppare(String a, String b) {
        return (a.compareTo(b) >= 0) ? true : false;
    }
}
