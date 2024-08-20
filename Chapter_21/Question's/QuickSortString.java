public class QuickSortString {
    public static void main(String[] args) {
        String []arr={"JAYESz","JAYESi","JAYESk"};
        quickSort(arr, 0, 2);
        for(String s:arr){
            System.out.println(s);
        }
    }

    public static void quickSort(String[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivotePoint = partition(arr, si, ei);
        quickSort(arr, si, pivotePoint - 1);
        quickSort(arr, pivotePoint + 1, ei);
    }

    public static int partition(String[] arr, int si, int ei) {
        String pivote = arr[ei];
        int j = si - 1;
        while (si < ei) {
            if (pivote.compareTo(arr[si]) >= 0) {
                String temp = arr[++j];
                arr[j] = arr[si];
                arr[si] = temp;
            }
            si++;
        }
        arr[si] = arr[++j];
        arr[j] = pivote;
        return j;
    }
}
