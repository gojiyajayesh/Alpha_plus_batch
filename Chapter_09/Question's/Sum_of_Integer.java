/**
 * Sum_of_Integer
 */
public class Sum_of_Integer {
    public static void main(String[] args) {
        sum(121);
    }
    public static void sum(int number) {
        int reverse=0;
        while(number>0)
        {
            int last=number%10;
            reverse+=last;
            number/=10;
        }
        System.out.println(reverse);
    }
}