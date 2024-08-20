/**
 * StringAnagram
 */
import java.util.Arrays;
public class StringAnagram {
    public static boolean anagram(String str,String str2)
    {
       str= str.toLowerCase();
       str2= str2.toLowerCase();
        if(str.length()==str2.length())
        {
            char str1A[]=str.toCharArray();
            char str2A[]=str2.toCharArray();
            Arrays.sort(str1A);
            Arrays.sort(str2A);
            return Arrays.equals(str1A,str2A);
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(anagram("1234","4321"));
    }
}