public class AllSubSetOfString {
    public static void main(String[] args) {
        subSet("Jayesh", "", 0);
    }

    public static void subSet(String str, String result, int index) {
        // Base Case
        if (str.length() == index) {
            if(result.length()==0)
            System.out.println("SubSet :- null(∅)");
            else
            System.out.println("SubSet :- " + result);
            return;
        }
        // Recursion
        // Yes
        subSet(str, result + str.charAt(index), index+1);
        // No
        subSet(str, result, index+1);
    }
}
