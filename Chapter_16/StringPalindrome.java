/**
 * StringPalindrome
 */
public class StringPalindrome {
    public static boolean palindrome(String str)   // Time Complexity is O(n) (Single loop is used)
    {
        int n=str.length();
        for(int i=0;i<n/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-1-i))
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(palindrome("1231"));
        System.out.println(palindrome("123454321"));
    }
}