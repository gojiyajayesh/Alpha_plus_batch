public class ThreadSynchronized {
    public static void main(String[] args) {
        Bus b = new Bus();
        ThreadBus b1 = new ThreadBus(b, 2);
        ThreadBus b2 = new ThreadBus(b, 2);
        ThreadBus b3 = new ThreadBus(b, 2);
        b1.setName("Jayesh");
        b2.setName("Raj");
        b3.setName("Vinayak");
        b1.start();
        b2.start();
        b3.start();
    }
}

class ThreadBus extends Thread {
    private Bus b;
    private int seatNumber;

    public ThreadBus(Bus b, int number) {
        this.b = b;
        this.seatNumber = number;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Called");
        b.seatReserve(seatNumber);
    }
}

class Bus {
    boolean seat[] = new boolean[3];

    public  synchronized void seatReserve(int seatNumber) {
        if (!seat[seatNumber]) {
            System.out.println(
                    "Hello " + Thread.currentThread().getName() + " " + seatNumber + " Number Seat is available ... !");
            try {
                Thread.sleep(1000); // Time For transection and other Process
            } catch (Exception e) {

            }
            System.out.println("Congratulation " + Thread.currentThread().getName() + " " + seatNumber
                    + " Number Seat is Reserved... !");
            seat[seatNumber] = true;
        } else {
            System.out.println("Sorry " + Thread.currentThread().getName() + " " + seatNumber
                    + " Number Seat is Already Reserved... !");
        }
    }
}
