public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            int a = 0, b = 90;
            int[] arr = new int[5];
            try {
                arr[0] = b / a; // Throw ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("can't divied by zero..."); // Sustom Exception Massege
                System.out.println(e);
            }
            arr[10] = 23; // Throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        try {
            int a = 50 / 0; // Throw ArithmeticException
            System.out.println(a);
        } catch (ArrayIndexOutOfBoundsException e) // You can handle proper exception it not work
        {
            System.out.println("can't divied by zero..."); // Sustom Exception Massege
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
