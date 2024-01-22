/**
 * SubString
 */
public class SubString {
    public static String substring(String str, int start, int end) {
            String NewString="";
            for(int i=start;i<end;i++)
            {
                NewString+=str.charAt(i);
            }
            return NewString;
    }

    public static void main(String[] args) {
        String str = "Jayesh Ahir";
        // End is Exclusive and Start in inclusive
        System.out.println(substring(str, 2, 7));   // Define in above method
        System.out.println(str.substring(2,7)); // inbuilt function
    }
}