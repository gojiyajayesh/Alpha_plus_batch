import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
        q.add(34);
        q.add(4);
        q.add(3);
        q.add(37);
        q.add(31);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
