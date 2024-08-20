import java.util.TreeSet;
import java.util.Iterator;

public class TreeHashSetCode {
    public static void main(String[] args) {
        System.out.println("Code start...");
        Integer[] arr = { 1, 2, 3, 4, 1, 3, 2, 1 };
        setCall(arr);
    }

    public static void setCall(Integer[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : arr) {
            set.add(i);
        }
        System.out.println(set);
        Iterator<Integer> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println(set.contains(5));
        System.out.println(set.size());
        set.clear();
        System.out.println(set.isEmpty());
    }
}
