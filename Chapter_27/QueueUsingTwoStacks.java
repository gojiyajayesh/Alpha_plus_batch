import java.util.Stack;

public class QueueUsingTwoStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation with O(n) time complexity
    public void enqueue(int value) {
        // Transfer all elements from stack1 to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        // Push the new element onto stack1
        stack1.push(value);
        // Transfer all elements back to stack1 from stack2
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    // Dequeue operation with O(1) time complexity
    public int dequeue() {
        if (stack1.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stack1.pop();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return stack1.size();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue()); // Output: 1
        System.out.println(queue.dequeue()); // Output: 2

        queue.enqueue(4);
        System.out.println(queue.dequeue()); // Output: 3
        System.out.println(queue.dequeue()); // Output: 4
    }
}
