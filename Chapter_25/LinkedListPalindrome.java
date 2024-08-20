public class LinkedListPalindrome {
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

    public static void main(String[] args) {
        LinkedListPalindrome ll = new LinkedListPalindrome();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(3);
        ll.displayLinkedList();
        System.out.print(ll.isPalindrome());
    }

    public Node findMidelElement() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean isPalindrome()
    {
        if(head==null||head.next==null)
        {
            return true;
        }
        // Step-1    find Midel Element
        Node mid=findMidelElement();
        // Step-2    reverse 2ed half
        Node prev=null;
        Node curr=mid;
        Node nextNode;
        while(curr!=null)
        {
            nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        Node left=head;
        Node right=prev;
        // Step-3  check palindrome or not
        while(right!=null)
        {
            if(left.data!=right.data)
            return false;
            right=right.next;
            left=left.next;
        }
        return true;
    }

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
}
