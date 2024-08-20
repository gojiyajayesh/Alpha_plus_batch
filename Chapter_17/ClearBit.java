/**
 * ClearBit
 */
public class ClearBit {
    public static int clearbit(int n, int i) {
        int bitMast=1<<i;
        bitMast=~bitMast;
        return bitMast&n;
    }

    public static void main(String[] args) {
        System.out.println(clearbit(5,2));
    }
}