import java.util.Stack;

public class LinkedListIsPalindrome {
    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(4);
        Node saven = new Node(3);
        Node eight = new Node(2);
        Node nine = new Node(1);
        head = one;
        tail = nine;
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = saven;
        saven.next = eight;
        eight.next = nine;
        System.out.println(isPalindrome());

    }

    public static boolean isPalindrome() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Stack<Integer> st = new Stack<>();
        while (slow != null) {
            st.push(slow.data);
            slow = slow.next;
        }
        Node temp = head;
        while (!st.empty()) {
            if (st.pop() != temp.data) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public static Node head;
    public static Node tail;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
