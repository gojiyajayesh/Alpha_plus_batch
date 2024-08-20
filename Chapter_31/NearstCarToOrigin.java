import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class NearstCarToOrigin {
    public static void main(String[] args) {
        List<Pair> list = new ArrayList<>();
        list.add(new Pair(3, 3, "C0"));
        list.add(new Pair(5, -1, "C1"));
        list.add(new Pair(-2, 4, "C2"));
        nearstCar(list, 2, 3);
    }

    public static void nearstCar(List<Pair> list, int k, int n) {
        PriorityQueue<Pair> q = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            q.offer(list.get(i));
            if (q.size() > k) {
                q.poll();
            }
        }
        List<Pair> p = new ArrayList<>(q);
        Collections.sort(p);
        for (Pair x : p.reversed()) {
            System.out.println(x);
        }

    }
}

class Pair implements Comparable<Pair> {
    int x;
    int y;
    String name;
    int distance;

    Pair(int x, int y, String name) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.distance = x * x + y * y;
    }

    @Override
    public String toString() {
        return "Pair [x=" + x + ", y=" + y + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Pair o) {
        return Integer.compare( o.distance,this.distance);
    }
}
