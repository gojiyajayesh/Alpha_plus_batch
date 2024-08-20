public class ThreadCreation {
    public static void main(String[] args) {
        Thread t1=new Thread();       // Only Thread Constructor
        ThreadUsingInterface runnable=new ThreadUsingInterface();
        Thread t2=new Thread(runnable);
        Thread t3=new Thread(runnable,"MyName");
        Thread t4=new Thread("MyName is t4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class ThreadUsingInterface implements Runnable {
    public void run() {
        System.out.println("Create Using Runnable Interface...");
    }
}

class ThreadUsingThreadClass extends Thread {
    public void run() {
        System.out.println("Create Using Thread Class...");
    }
}
