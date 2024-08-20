import java.util.LinkedList;
import java.util.Deque;
public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(23);
        deque.addFirst(48);
        System.out.println(deque);
        deque.addLast(60);
        System.out.println(deque.getLast());
    }
}
