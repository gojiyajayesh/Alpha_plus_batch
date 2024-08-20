/**
 * Changebit
 */
public class Changebit {
    public static int changebit(int n,int i)
    {
        int bitMask=1<<i;
        return bitMask^n;
    }
    public static void main(String[] args) {
        System.out.println(changebit(5, 0));
    }
}