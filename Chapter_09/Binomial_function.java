public class Binomial_function {
    public static void main(String[] args) {
        int n=5,r=2;
       double Binomial_function=fec(n)/(fec(n-r)*fec(r));
       System.out.println(Binomial_function);
    }

    public static int fec(int n)
     {
        int fec=1;
        for(int i=1;i<=n;i++)
        {
            fec*=i;
        }
        return fec;
     }
    }
