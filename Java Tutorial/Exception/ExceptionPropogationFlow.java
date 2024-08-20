public class ExceptionPropogationFlow {
    public static void main(String[] args) {
        try {
            first();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void first() {
        System.out.println("First Method are called...");
        try {
            second();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("First Method are rest Of Code...");
    }

    public static void second() {
        System.out.println("second Method are called...");
        try {
            third();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("second Method are rest Of Code...");
    }

    public static void third() {
        System.out.println("third Method are called...");
            fourth();
        System.out.println("third Method are rest Of Code...");
    }

    public static void fourth() {
        System.out.println("fourth Method are called...");
        throw new ArithmeticException("Arithemetic Exception Occur....");
    }
}
