public class LinkedListIsCycle {
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
    public static int size = 0;

    public void displayLinkedList() {
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

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        // List is Empty then
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data) {
        if (head == null) {
          addFirst(data);
          return;
        }
        Node newNode = new Node(data);
        size++;
        tail.next = newNode;
        tail = newNode;
        if(newNode.data==6)
        {
            Node prev=null;
            Node curr=head;
            int i=0;
            while(i<3)
            {
                prev=curr;
                curr=curr.next;
                i++;
            }
            newNode.next=prev;
        }
      }

    public static void main(String[] args) {
        LinkedListIsCycle ll = new LinkedListIsCycle();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addLast(6);

        System.out.println(ll.isCycle());
       // ll.displayLinkedList();    // cycle linked list are run continue
        ll.removeCycle();
        System.out.println(ll.isCycle());
        ll.displayLinkedList();
        System.out.println(ll);
    }

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public void removeCycle() {
        // check cycle is exist or not
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }

        if (!flag) return;
        
        // slow head and fast and slow +1
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast; 
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }
}
