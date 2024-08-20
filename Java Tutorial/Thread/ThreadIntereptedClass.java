public class ThreadIntereptedClass {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    if (Thread.interrupted())
                        System.out.println("Intrepted Thread...");
                    else
                        System.out.println("Normal Thread...");
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    if (Thread.interrupted())
                        System.out.println("Intrepted Thread...");
                    else
                        System.out.println("Normal Thread...");
                }
            }
        };

        // T1 Start and then Interrupt
        t1.start();
        t1.interrupt();
        
        
        t2.start();

    }
}
