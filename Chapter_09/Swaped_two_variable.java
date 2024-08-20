public class Swaped_two_variable {
    public static void main(String[] args) {
        swap(10,12);
    }
    public static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("A is "+a+" B is "+b);

        // swap two number without third number
        int x=10;
        int y=20;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("A is "+x+" B is "+y);
    }
}
