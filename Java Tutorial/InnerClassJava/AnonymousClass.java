public class AnonymousClass {
    public static void main(String[] args) {
        People p = new People() {
            void msg() {
                System.out.println("This is a People Class Method");
            }
        };
        p.msg();
        new People(){void msg(){}}.msg();
    }
}

abstract class People {
    abstract void msg();
}
