/**
 * Binary_to_decimal
 */
public class Binary_to_decimal {
    public static void main(String[] args) {
        System.out.println(B_to_D(111));
    }

    public static int B_to_D(int n) {
        int decimal=0,cnt=0;
        while(n>0)
        {
           int last=n%10;
           decimal+=(last*Math.pow(2,cnt++));
           n/=10;
        }
        return decimal;
    }
}