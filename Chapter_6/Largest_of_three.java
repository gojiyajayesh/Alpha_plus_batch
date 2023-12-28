public class Largest_of_three {
    public static void main(String[] args) {
        int a=16,b=15,c=14;
        if(a>b)
        {
            if(a>c)
            System.out.println("A is a largest Number");
            else
            System.out.println("C is a largest Number");
        }
        else
        {
            if(b>c)
            System.out.println("B is a largest Number");
            else
            System.out.println("C is a largest Number");
        }
    }
}
