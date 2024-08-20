import java.util.Comparator;
import java.util.PriorityQueue;

public class SlidingWindow {
    public static void main(String[] args) {
        int arr[] = { 1,3,-1,-3,5,3,6,7 };
        slidingWindows(arr, 3);
    }

    public static void slidingWindows(int[] arr, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> -o[0]));
        int n = arr.length;
        int[] result = new int[n - k + 1];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            queue.offer(new int[] { arr[i], i });
            if (i >= k-1) {
                while (!queue.isEmpty()&&queue.peek()[1] <= (i - k)) {
                    queue.remove();
                }
                result[index++]=queue.peek()[0];
            }
        }

        for(int i:result){
            System.out.print(i+" ");
        }

    }
}
