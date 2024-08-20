public class Question3 {
    public static void main(String[] args) {
        Q3 a=new Q3();
        a.Bprint();   // invoke class A method in java
    }
}
class Q3{
    int a=10;
    int b=20;
    void Bprint()
    {
        B bclass=new B();
        bclass.print();    // invoke class b method 
        // b is private but class A is Access this class 
    }
    private class B{
        void print()
        {
            System.out.println("Hello Private class!!!");
        }
    }
}
