import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetCode {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 4, 3, 3, 3, 2, 1 };
        setCall(arr);
    }

    public static void setCall(Integer[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i : arr) {
            set.add(i);
            set.add(null);
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
