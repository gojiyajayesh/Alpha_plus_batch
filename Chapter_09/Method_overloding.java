/*
 * Method Overloding Using Number of Parameter... 
 * it is not depend on Return type...
 */
public class Method_overloding {
    public static void main(String[] args) {
        int a=10,b=12,c=23;
        sum(a,b);
        sum(a,b,c);
    }
    public static void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}
