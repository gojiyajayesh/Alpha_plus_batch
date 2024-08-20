import java.util.ArrayList;

public class InsertInHeap {
    public static class Heap {
        public ArrayList<Integer> heap = new ArrayList<>();

        public static void swap(int a, int b, ArrayList<Integer> list) {
            Integer temp = list.get(a);
            list.set(a, list.get(b));
            list.set(b, temp);
        }

        public void insert(int data) {
            if (heap.isEmpty()) {
                heap.add(data);
                return;
            }
            heap.add(data);
            int parent = (heap.size() - 2) / 2;
            int chiled = heap.size() - 1;
            while (heap.get(chiled) < heap.get(parent)) {
                swap(chiled, parent, heap);
                chiled = parent;
                parent = (chiled - 1) / 2;
            }
        }

        public int delete() {
            // swap root and leaf
            swap(0, heap.size() - 1, heap);
            // delete leaf
            int val = heap.remove(heap.size() - 1);
            // fix Heap
            heapify(0, heap);
            return val;
        }

        public void heapify(int parent, ArrayList<Integer> list) {
            int min = parent;
            int left = parent * 2 + 1;
            int right = parent * 2 + 2;
            if (left < list.size() && list.get(min) > list.get(left)) {
                min = left;
            }

            if (right < list.size() && list.get(min) > list.get(right)) {
                min = right;
            }

            if (min != parent) {
                swap(parent, min, list);
                heapify(min, list);
            }
        }

        public int peek() {
            if (heap.isEmpty()) {
                return Integer.MIN_VALUE;
            }
            return heap.get(0);
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(60);
        heap.insert(10);
        heap.insert(20);
        heap.insert(30);
        heap.insert(40);
        heap.insert(50);
        heap.insert(70);
        heap.insert(80);
        for (Integer i : heap.heap) {
            System.out.print(i + " ");
        }
        // System.out.println(heap.peek());
        System.out.println("\n"+heap.delete());
        for (Integer i : heap.heap) {
            System.out.print(i + " ");
        }
    }
}
