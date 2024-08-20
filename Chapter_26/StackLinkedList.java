public class StackLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static class Stack {
        public void push(int data) {
            Node newNode = new Node(data);
            size++;
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return Integer.MAX_VALUE;
            }
            size--;
            int val = head.data;
            head = head.next;
            return val;
        }

        public int peek() {
            if(isEmpty())
            {
                System.out.println("Stack is Empty!");
                return Integer.MAX_VALUE;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(12);
        stack.push(13);
        stack.push(14);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
