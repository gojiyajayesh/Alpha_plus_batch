public class Power {
    static int cnt1=0,cnt2=0,cnt3=0;
    public static void main(String[] args) {
        System.out.println(pow(2, -20));
        System.out.println(PowerOptimize(2, -20));
        System.out.println(power(2, -20));
        System.out.println(cnt1);    // O(n)
        System.out.println(cnt2);   // O(logn)
        System.out.println(cnt3);   // O(logn)
    }
    public static double pow(double a,int n)
    {
        cnt1++;
        if(n<0){
            return 1/pow(a,-n);
        }
        if(n==0)
        return 1;
        return a*pow(a,--n);
    }
    public static double PowerOptimize(double a,int n)
    {
        cnt2++;
        if(n<0){
            return 1/PowerOptimize(a,-n);
        }
        if(n==0)
        return 1;
        double half=PowerOptimize(a, n/2);
        double full=half*half;
        if((n&1)==1)
        return a*full;
        return full;
    }
    public static double power(double a,int n)
    {
        cnt3++;
        if(n<0){
            return 1/power(a,-n);
        }
        if(n==0)
        return 1;
        return ((n&1)==1)?a*power(a, n-1):power(a*a, n/2);
    }
}
