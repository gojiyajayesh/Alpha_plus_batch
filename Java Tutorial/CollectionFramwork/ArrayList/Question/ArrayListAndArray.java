import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListAndArray {
    public static void main(String[] args) {
        ArrayList<String> firstList = new ArrayList<String>();
        firstList.add("Apple");
        firstList.add("Pears");
        firstList.add("Guava");
        firstList.add("Mango");
        System.out.println(firstList);

        String[] arr = firstList.toArray(new String[firstList.size()]);

        for (String item : arr) {
            System.out.println(item);
        }

        List<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
    }
}
