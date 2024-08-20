public class Method{
    public static void main(String[] args) {
        System.out.println(sum(10,(long)20));
    }
    public static long sum(int a,long b){
        System.out.println("Method 1 called");
        return a+b;
    }
    public static long sum(long a,int b){
        System.out.println("Method 2 called");

        return a+b;
    }
    public static long sum(long a,long b){
        System.out.println("Method 2 called");

        return a+b;
    }
    public static double sum(double a,double b){
        System.out.println("Method 2 called");

        return a+b;
    }
}