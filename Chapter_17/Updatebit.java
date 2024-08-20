public class Updatebit {
    public static void main(String[] args) {
        System.out.println(update(5, 0, 0));
    }
    public static int update(int n,int i,int v)
    {
        // if(v==0)
        // return clearbit(n,i);   // Clearbit class method
        // else 
        // return 
        // return setbit(n,i);     // Setbit class method
        n=clearbit(n,i);
        int bitMask=v<<i;
        return bitMask|n;
    }
    public static int clearbit(int n, int i) {
        int bitMast=1<<i;
        bitMast=~bitMast;
        return bitMast&n;
    }
}
