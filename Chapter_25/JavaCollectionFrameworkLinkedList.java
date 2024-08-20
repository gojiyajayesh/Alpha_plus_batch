import java.util.LinkedList;
public class JavaCollectionFrameworkLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer>  ll=new LinkedList<>();
        ll.addLast(10);
        ll.add(20);
        ll.addFirst(34);
        System.out.println(ll);
        ll.remove();
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
    }
}
