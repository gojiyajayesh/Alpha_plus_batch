import java.util.LinkedList;
import java.util.Deque;

public class StackUsingDeque {
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public int poll() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.getFirst();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        Queue q = new Queue();

        // Test Stack
        System.out.println("Testing Stack:");
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Peek: " + s.peek()); // 30
        System.out.println("Pop: " + s.pop());   // 30
        System.out.println("Pop: " + s.pop());   // 20
        System.out.println("Peek: " + s.peek()); // 10
        System.out.println("Pop: " + s.pop());   // 10
        System.out.println("Is Empty: " + s.isEmpty()); // true

        // Test Queue
        System.out.println("\nTesting Queue:");
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Peek: " + q.peek()); // 1
        System.out.println("Poll: " + q.poll()); // 1
        System.out.println("Poll: " + q.poll()); // 2
        System.out.println("Peek: " + q.peek()); // 3
        System.out.println("Poll: " + q.poll()); // 3
        System.out.println("Is Empty: " + q.isEmpty()); // true
    }
}
