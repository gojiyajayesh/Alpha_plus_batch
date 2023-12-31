public class Prime_number {
    public static void main(String[] args) {
        System.out.println(prime_Number(11));
    }
    public static boolean prime_Number(int n)
    {
        if(n==2)
        return true;
        for(int i=2;i<=Math.pow(n, 0.5);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
}
