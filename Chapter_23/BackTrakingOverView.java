public class BackTrakingOverView {
    public static void main(String[] args) {
        int arr[] = new int[5];
        backTrack(arr, 0, 1);
        for (int a : arr) {
            System.out.print(a+" ");
        }
    }

    public static void backTrack(int[] arr, int index, int value) {
        if (index == arr.length)
            return;
        arr[index++] = value++;
        backTrack(arr, index, value);
        arr[--index] = --value - 2;
    }
}
