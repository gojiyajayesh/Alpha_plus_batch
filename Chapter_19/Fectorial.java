public class Fectorial {
    public static void main(String[] args) {
        System.out.println(fec(5));
    }
    public static int fec(int n)
    {
        if(n==0)
        return 1;
        return n*fec(n-1);
    }
}
