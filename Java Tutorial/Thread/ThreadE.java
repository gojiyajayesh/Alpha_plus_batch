class Counter {
    private int count = 0;
    
    public synchronized void increment() {
        count++;
    }
    
    public int getCount() {
        return count;
    }
}

class CounterTask extends Thread {
    private Counter counter;
    
    CounterTask(Counter counter) {
        this.counter = counter;
    }
    
    public void run() {
        for(int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class ThreadE {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        
        CounterTask task1 = new CounterTask(counter);
        CounterTask task2 = new CounterTask(counter);
        
        task1.start();
        task2.start();
        
        task1.join();
        task2.join();
        
        System.out.println("Final count: " + counter.getCount());
    }
}
