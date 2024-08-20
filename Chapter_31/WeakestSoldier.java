import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class WeakestSoldier {
    public static void main(String[] args) {
        List<Raw> list = new ArrayList<>();
        int[][] arr = { { 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0 } };
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1)
                    count++;
            }
            list.add(new Raw(count, i));
        }
        findWeakestSoldier(list);
    }

    public static void findWeakestSoldier(List<Raw> list) {
        PriorityQueue<Raw> queue = new PriorityQueue<>((f, s) -> {
            if (f.soldier == s.soldier) {
                return Integer.compare(f.index, s.index);
            } else {
                return Integer.compare(f.soldier, s.soldier);
            }
        });

        for (int i = 0; i < list.size(); i++) {
            queue.offer(list.get(i));
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}

class Raw {
    int soldier;
    int index;

    @Override
    public String toString() {
        return "Raw [soldier=" + soldier + ", Raw" + (index + 1) + "]";
    }

    Raw(int soldier, int index) {
        this.index = index;
        this.soldier = soldier;
    }
}
