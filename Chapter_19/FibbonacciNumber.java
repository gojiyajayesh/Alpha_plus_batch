public class FibbonacciNumber{
    static int count=0;
    public static void main(String[] args) {
        System.out.println(fib(50));
        System.out.println(count);
    }
    public static int fib(int n) {
        count++;
        if(n==0||n==1)
        return n;
        return fib(n-1)+fib(n-2);
    }
}