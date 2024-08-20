public class MethodOverLoding {
    public static void main(String[] args) {
        System.out.println(sum(10,10,10));
    }
    public static int sum(int n,int a,int r)
    {
        return  n+a+r;
    }
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static float sum(float a,float b)
    {
        return a+b;
    }
}
