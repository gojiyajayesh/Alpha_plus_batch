/**
 * Getbit
 */
public class Getbit {
    public static int getbit(int n,int i)
    {
        return (n&(1<<i))==(1<<i)?1:0;
    }
    public static void main(String[] args) {
        System.out.println(getbit(5,2));     // bit counting is start 0^th position to n^th
    }
}