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
    }
}
