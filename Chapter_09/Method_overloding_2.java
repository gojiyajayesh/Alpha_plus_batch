/**
 * Method_overloding_2
 * Method overloding using Parameter datatype
 */
public class Method_overloding_2 {
    public static void main(String[] args) {
        int a=12,b=13;
        float c=10.2f,d=56.7f;
        sum(a,b);
        sum(c,d);
    }
    public static void sum(int a,int b)  
    // if this method is not define then call Float fuction of two integer number
    {
        System.out.println("Call Integer Sum Function");
        System.out.println(a+b);
    }
    public static void sum(float a,float b)
    {
        System.out.println("Call Float Sum Function");
        System.out.println(a+b);
    }
}