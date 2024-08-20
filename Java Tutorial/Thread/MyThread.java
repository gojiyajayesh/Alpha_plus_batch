/**
 * This is Thread using Runnable Interface 
 * run method defination is require in this runnable interface
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread-2 = " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread runnable = new MyThread();
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread-1 =" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
