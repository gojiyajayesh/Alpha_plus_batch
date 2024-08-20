/**
 * Clear_i_bits
 */
public class Clear_i_bits {
    public static int clearbit(int n,int i)
    {
        int bitMask=(~0)<<i;
        return bitMask&n;
    }
    public static void main(String[] args) {
        System.out.println(clearbit(5, 4));
    }
}