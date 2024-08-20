public class MergeSortInLinkedList {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void main(String[] args) {
        MergeSortInLinkedList ll=new MergeSortInLinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.displayLinkedList(head);
        head=ll.mergeSort(head);
        ll.displayLinkedList(head);
    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        // List is Empty then
        if (head == null) {
          head = tail = newNode;
          return;
        }
        newNode.next = head;
        head = newNode;
      }
    public void displayLinkedList(Node head) {
        if (head == null) {
          System.out.println("Linked List Is Empty !");
          return;
        }
        Node current = head;
        while (current != null) {
          System.out.print(current.data + " -> ");
          current = current.next;
        }
        System.out.println("null");
      }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null)
            return head;
        // find mid
        Node mid = findMid(head);
        // divied linkedlist in two part
        Node leftHead = head;
        Node rightHead = mid.next;
        mid.next = null;
        leftHead = mergeSort(leftHead);
        rightHead = mergeSort(rightHead);
        // merge LinkedList
        return mergeLink(leftHead, rightHead);
    }

    public Node mergeLink(Node head1, Node head2) {
        Node meargwLL = new Node(-1);
        Node temp = meargwLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return meargwLL.next;
    }
}
