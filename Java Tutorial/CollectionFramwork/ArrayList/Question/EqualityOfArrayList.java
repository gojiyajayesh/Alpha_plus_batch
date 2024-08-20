import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EqualityOfArrayList {
    public static void main(String[] args) {
        /*
         * 1. equals
         * 2. removeAll
         * 3. retainAll
         * 4. contains
         * 5. contentsEquals
         * 6. Stream
         */

        ArrayList<String> firstList = new ArrayList<String>();
        // adds elements to the arraylist
        firstList.add("Apple");
        firstList.add("Pears");
        firstList.add("Guava");
        firstList.add("Mango");
        System.out.println(firstList);
        // second array list
        List<String> secondList = new ArrayList<String>();
        // adds elements to the arraylist
        secondList.add("Apple");
        secondList.add("Pears");
        secondList.add("Guava");
        secondList.add("Mango");
        System.out.println(secondList);
        // comparing both lists
        boolean boolval = firstList.equals(secondList); // returns true because lists are equal
        System.out.println(boolval);
        // adding another element in the second list
        secondList.add("Papaya");
        // again comparing both lists
        boolean bool = firstList.equals(secondList); // returns false because lists are not equal
        System.out.println(bool);
        System.out.println("---------------------------------------------------------------------");
        secondList.removeAll(firstList);
        System.out.println(secondList);
        System.out.println("---------------------------------------------------------------------");
        // first arraylist
        ArrayList<String> firstList2 = new ArrayList<String>(Arrays.asList("M", "W", "J", "K", "T"));
        System.out.println("First arraylist: ");
        System.out.println(firstList2);
        // second arraylist
        List<String> secondList2 = new ArrayList<String>(Arrays.asList("M", "W", "E", "K", "T"));
        System.out.println("Second arraylist: ");
        System.out.println(secondList2);
        // returns the common elements in both list
        secondList2.retainAll(firstList2);
        System.out.println("Common elements in both list: ");
        System.out.println(secondList2);
        System.out.println("------------------------------------------------------------------------");
        // first arraylist
        ArrayList<String> firstList3 = new ArrayList<String>(Arrays.asList("Good", "Morning", "Students"));
        // second arraylist
        ArrayList<String> secondList3 = new ArrayList<String>(Arrays.asList("Good", "Night", "frineds"));
        // storing the comparison output in thirdList
        ArrayList<String> thirdList = new ArrayList<String>();
        // iterator using for-each loop
        for (String tempList : firstList3) // tempList is a variable
            thirdList.add(secondList3.contains(tempList) ? "Yes" : "No");
        System.out.println(thirdList);
        System.out.println("----------------------------------------------------------------------------");
        ArrayList<String> firstList4 = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go"));
        ArrayList<String> secondList4 = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go"));
        System.out.println("When Lists are same: " + compareList(firstList4, secondList4));
        // adding another element to the secondList
        secondList4.add("C++");
        // output after adding different element
        System.out.println("When Lists are not same: " + compareList(firstList4, secondList4));
    }

    public static boolean compareList(ArrayList<String> ls1, ArrayList<String> ls2) {
        // converts List into String and checks string are equal or not
        return ls1.toString().contentEquals(ls2.toString()) ? true : false;
    }
}
