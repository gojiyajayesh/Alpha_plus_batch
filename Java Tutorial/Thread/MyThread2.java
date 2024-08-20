public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("----------------------------Thread-2--------------------------------------------");
        for (int i = 0; i < 100; i++) {
            System.out.println("THread-2 value of i=" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread2 thread=new MyThread2();
        thread.start();
        Thread name=Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(name.getName() + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
