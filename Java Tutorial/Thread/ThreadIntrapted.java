public class ThreadIntrapted {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println("Continue Running");
            }
        };

        t1.start();

        try {
            Thread.sleep(1000);
            t1.interrupt();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
