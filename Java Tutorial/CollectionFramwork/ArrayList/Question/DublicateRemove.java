import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class DublicateRemove {
    public static void main(String[] args) {
         ArrayList<String> firstList = new ArrayList<String>();
        // adds elements to the arraylist
        firstList.add("Apple");
        firstList.add("Pears");
        firstList.add("Guava");
        firstList.add("Mango");
        firstList.add("Guava");
        firstList.add("Mango");
        System.out.println(firstList);
        Set<String> set=new LinkedHashSet<>(firstList);
        System.out.println(set);
    }
}
