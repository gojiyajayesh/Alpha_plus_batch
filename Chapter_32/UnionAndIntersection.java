import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] second = {10, 11, 12, 1, 14, 15, 16};
        
        System.out.println("Union Of Two Arrays is: " + findUnion(first, second));
        System.out.println("Intersection Of Two Arrays is: " + findIntersection(first, second));
    }
    
    public static List<Integer> findIntersection(int[] first, int[] second) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        
        for (int num : first) {
            set.add(num);
        }
        
        for (int num : second) {
            if (set.contains(num)) {
                resultSet.add(num);
            }
        }
        
        return new ArrayList<>(resultSet);
    }
    
    public static List<Integer> findUnion(int[] first, int[] second) {
        Set<Integer> resultSet = new TreeSet<>();
        
        for (int num : first) {
            resultSet.add(num);
        }
        
        for (int num : second) {
            resultSet.add(num);
        }
        
        return new ArrayList<>(resultSet);
    }
}
