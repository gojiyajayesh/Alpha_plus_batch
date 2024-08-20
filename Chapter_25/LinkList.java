public class LinkList {

  // Each Node Blue Print
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  // head For LinkList
  public static Node head;
  // tail For LinkList
  public static Node tail;
  // size Element Of LinkList
  public static int size = 0;

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
  }

  public void addAnyWhare(int data, int index) {
    if (head == null || index == 0) {
      addFirst(data);
      return;
    }
    if (index < 0 || index > size) {
      System.out.println("Invalid Index Please Add Valid Index");
      return; 
    }
    Node newNode = new Node(data);
    size++;
    int i = 0;
    Node temp = head;
    while (temp != null && i < index - 1) {
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
  }

  public static void main(String args[]) {
    LinkList list = new LinkList();

    // Adding elements to the beginning of the list
    list.addFirst(5);
    list.addFirst(3);
    list.addFirst(1);

    // Adding elements to the end of the list
    list.addLast(7);
    list.addLast(9);

    // Adding elements at specific positions
    list.addAnyWhare(4, 2); // Adding 4 at index 2 (0-based indexing)
    list.addAnyWhare(6, 4); // Adding 6 at index 4

    // Displaying the linked list
    list.displayLinkedList();
    list.removeFirst();
    list.displayLinkedList();
    list.removeLast();
    list.displayLinkedList();
    list.removeIndex(2);
    list.displayLinkedList();
    System.out.println("Element present in location " + list.searchElement(6));
    System.out.println("Element present in location " + list.searchElementR(7));
    list.reverseLinkedList();
    list.displayLinkedList();
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

  public int removeFirst() {
    if (head == null) {
      System.out.println("Linked List Is Empty!");
      return Integer.MAX_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
  }

  public int removeIndex(int index) {
    if (head == null) {
      System.out.println("Linked List is Empty!");
      return Integer.MIN_VALUE;
    } else if (index > size - 1) {
      System.out.println("Invalid Index please add right index !");
      return Integer.MIN_VALUE;
    } else if (index == 0) {
      return removeFirst();
    } else if (index == size - 1) {
      return removeLast();
    }

    Node prev = head;
    int i = 0;
    while (i < index - 1) {
      prev = prev.next;
      i++;
    }
    size--;
    int val = prev.next.data;
    prev.next = prev.next.next;
    return val;
  }

  public int removeLast() {
    if (head == null) {
      System.out.println("Link List is Empty!");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }
    Node temp = head;
    int i = 0;
    while (i < size - 2) {
      temp = temp.next;
      i++;
    }
    int val = tail.data;
    temp.next = null;
    tail = temp;
    size--;
    return val;
  }

  public int searchElement(int key) {
    if (head == null) {
      System.out.println("Linked List is empty !");
      return -1;
    }
    Node temp = head;
    int i = 0;
    while (temp != null) {
      if (temp.data == key) {
        return i;
      }
      i++;
      temp = temp.next;
    }
    return -1;
  }

  public int searchElementR(int key) {
    return search(key, head);
  }

  public int search(int key, Node head) {
    if (head == null) {
      return -1;
    }
    if (head.data == key)
      return 0;
    int val = search(key, head.next);
    return (val != -1) ? val + 1 : -1;
  }

  public void reverseLinkedList() {
    if (head == null){
      System.out.println("Linked List is Empty!");
      return;
    }
    Node Prev = null;
    Node Next;
    Node Curr = tail = head;
    while (Curr != null) {
      Next = Curr.next;
      Curr.next = Prev;
      Prev = Curr;
      Curr = Next;
    }
    head = Prev;
  }
}