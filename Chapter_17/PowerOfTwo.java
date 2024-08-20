/**
 * PowerOfTwo
 */
public class PowerOfTwo {
    public static boolean isPower(int n)
    {
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(isPower(9));    // 8---> 2^3   9---> 2^n ! so work complate...
    }
}