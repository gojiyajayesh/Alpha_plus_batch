/**
 * Clearrange
 */
public class Clearrange {
    public static int clearrange(int n,int i,int j)
    {
        int a=(-1)<<j+1;      //  111111110000...
        int b=(i<<i)-1;
        return (a|b)&n;

    }
    public static void main(String[] args) {
        System.out.println(clearrange(10, 2, 5));
    }
}