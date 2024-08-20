public class StaticBlock {
    public static void main(String[] args) {
        Thread t2 = Thread.currentThread();
        System.out.println(t2.getName());
        Test t = new Test();
        byte a = 10;
        byte b = 10;
        t.sum(a, b);
    }
}

class Test {
    public void sum(float a, float b) {
        System.out.println("Float  sum method called...");
    }

    public void sum(int a, int b) {
        System.out.println("Int sum method called...");
    }
}