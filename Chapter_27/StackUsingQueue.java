import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue {
    // Stack implementation with push O(1) and pop/peek O(n)
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // Push element into the stack
        public void push(int data) {
            if (isEmpty()) {
                q1.add(data);
                return;
            }

            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // Pop element from the stack
        public int pop() {
            int top = -1;
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty!!");
            }

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.poll();
                    if (!q1.isEmpty())
                        q2.add(top);
                }
                return top;
            } else {
                while (!q2.isEmpty()) {
                    top = q2.poll();
                    if (!q2.isEmpty())
                        q1.add(top);
                }
                return top;
            }
        }

        // Peek at the top element of the stack
        public int peek() {
            int top = -1;
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty!!");
            }

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.poll();
                    q2.add(top);
                }
                return top;
            } else {
                while (!q2.isEmpty()) {
                    top = q2.poll();
                    q1.add(top);
                }
                return top;
            }
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }
    }

    // Stack2 implementation with push O(n) and pop/peek O(1)
    static class Stack2 {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // Push element into the stack
        public void push(int data) {
            if (q1.isEmpty()) {
                q1.add(data);
                while (!q2.isEmpty()) {
                    q1.add(q2.poll());
                }
            } else {
                q2.add(data);
                while (!q1.isEmpty()) {
                    q2.add(q1.poll());
                }
            }
        }

        // Peek at the top element of the stack
        public int peek() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is Empty!");
            }

            if (q1.isEmpty()) {
                return q2.peek();
            } else {
                return q1.peek();
            }
        }

        // Pop element from the stack
        public int pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is Empty!");
            }

            if (q1.isEmpty()) {
                return q2.poll();
            } else {
                return q1.poll();
            }
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }
    }

    public static void main(String[] args) {
        Stack2 s = new Stack2();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop()); // Output: 3
        System.out.println(s.pop()); // Output: 2
        System.out.println(s.pop()); // Output: 1
    }
}
