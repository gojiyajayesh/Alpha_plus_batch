public class QueueLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        public Node head = null;
        public Node tail = null;

        // Add to queue
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            System.out.println("Added " + data + " to the queue.");
        }

        // Remove from queue
        public int remove() {
            if (head == null) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int val = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            System.out.println("Removed " + val + " from the queue.");
            return val;
        }

        // Display queue
        public void display() {
            if (head == null) {
                System.out.println("Queue is empty!");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.display();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.display();
        Queue queue2 = new Queue();
        queue2.display();
    }
}
