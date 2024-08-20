/**
 * CompareString
 */
public class CompareString {

    public static void main(String[] args) {
        String str[] = { "jayesh", "nirbhay", "rajyo", "haryo" };
        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (str[i].compareTo(largest) > 0) // Inbuilt Function
                largest = str[i];
        }
        System.out.println(largest);
        
    }

}