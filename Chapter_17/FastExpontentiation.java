public class FastExpontentiation {
    public static void main(String[] args) {
        System.out.println(fastExpo(2,-200));
    }
    public static double fastExpo(double a,int n)
    {
        boolean isNagative=false;
        if(n<0){
            isNagative=true;
            n=Math.abs(n);
        }
        double ans=1;
        while(n>0)
        {
            if((n&1)==1)
            {
                ans*=a;
            }
            a=a*a;
            n=n>>1;
        }
        return (isNagative)?1.0/ans:ans;
    }
}
