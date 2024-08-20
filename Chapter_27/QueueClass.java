import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        // Display the queue
        System.out.println("Queue: " + queue);

        // Remove elements from the queue
        System.out.println("Removed: " + queue.remove());
        System.out.println("Removed: " + queue.remove());

        // Display the queue after removals
        System.out.println("Queue after removals: " + queue);

        // Peek at the front element of the queue
        System.out.println("Front element: " + queue.peek());

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());

        // Iterate through the queue
        System.out.print("Queue elements: ");
        for (Integer element : queue) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
