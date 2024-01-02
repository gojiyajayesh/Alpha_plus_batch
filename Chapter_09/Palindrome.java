public class Palindrome {
    public static void main(String[] args) {
        System.out.println("This is a Plindrome Number :- "+ is_Palindrome(21));
    }

    public static boolean is_Palindrome(int n) {
        int temp=n;
        int reverse=0;
        while(n>0)
        {
            int last=n%10;
            reverse=(reverse*10)+last;
            n/=10;
        }
        if(reverse==temp)
        return true;
        return false;
    }
}
