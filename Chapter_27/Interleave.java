import java.util.LinkedList;
import java.util.Queue;

public class Interleave {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);
        
        System.out.println("Original queue:");
        for (Integer i : queue) {
            System.out.print(i + " ");
        }
        
        interLeave(queue);
        
        System.out.println("\nInterleaved queue:");
        for (Integer i : queue) {
            System.out.print(i + " ");
        }
    }

    public static void interLeave(Queue<Integer> queue) {
        if (queue.size() % 2 != 0) {
            System.out.println("\nThe interleave operation requires the queue to have an even number of elements.");
            return;
        }

        int halfSize = queue.size() / 2;
        Queue<Integer> firstHalf = new LinkedList<>();
        
        // Step 1: Dequeue the first half of the queue and enqueue it to the firstHalf queue
        for (int i = 0; i < halfSize; i++) {
            firstHalf.add(queue.poll());
        }

        // Step 2: Interleave the elements from the firstHalf queue with the remaining elements in the original queue
        while (!firstHalf.isEmpty()) {
            queue.add(firstHalf.poll());
            queue.add(queue.poll());
        }
    }
}
