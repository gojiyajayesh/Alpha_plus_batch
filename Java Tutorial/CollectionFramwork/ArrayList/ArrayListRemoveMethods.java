import java.util.ArrayList;

public class ArrayListRemoveMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("jayesh");
        list.add("manju");
        list.add("ramesh");
        list.add("jayesh gojiya");
        list.add("jayesh ahir");

        System.out.println(list);

        list.remove("jayesh");

        System.out.println(list);

        list.remove(0);

        System.out.println(list);

        list.add("jayesh");
        list.add("manju");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("jayesh");
        list2.add("manju");
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);

        list.removeIf(str -> str.equals("jayesh ahir"));

        System.out.println(list);

        list.add("jayesh");
        list.add("jayesh gojiya");
        list.add("jayesh ahir");
        list.add("jayesh bhai");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(list);
        list.removeIf(str -> str.contains("jayesh"));
        System.out.println(list);
    }
}
