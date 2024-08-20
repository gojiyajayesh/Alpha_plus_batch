public class FinalyBlockTry {
    public static void main(String[] args) {
        try {
            System.out.println("System.exit() are called ...");
            System.exit(0);  // JVM are stop the execution of program
            int a = 30 / 0;
            System.out.println(a);
        } finally {
            // Finally Block are always Execute in following condition this are not execute
            // 1. System.exit(); call
            // 2. VertualMachine are shutdown
            // 3. Os System are Power down
            System.out.println("Finally Block are Always Call...");
        }
        System.out.println("Rest Of Code...");
    }
}
