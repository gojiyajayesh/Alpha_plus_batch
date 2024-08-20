# Java Thread Class Methods

The `Thread` class in Java provides several methods for managing threads and their execution. Below are explanations and examples of some key methods:

## Ways to Create a Thread

There are three main ways to create a thread in Java:

### 1. Extending the `Thread` Class

You can create a thread by extending the `Thread` class and overriding its `run()` method.

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running...");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Start the thread
    }
}
```

### 2. Implementing the `Runnable` Interface

You can implement the `Runnable` interface and pass an instance of your class to a `Thread` object.

```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running...");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start(); // Start the thread
    }
}
```

### 3. Using the `Executors` Framework

You can use the `Executors` framework to create and manage threads.

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running...");
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new MyRunnable());
        executor.shutdown();
    }
}
```

## Key Methods in the `Thread` Class

### 1. `start()`

- **Description:** Starts the execution of the thread. The `run()` method of the thread is invoked.

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running...");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Start the thread
    }
}
```

### 2. `run()`

- **Description:** Entry point for the thread. This method contains the code that constitutes the new thread.

```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running...");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start(); // Start the thread and execute run()
    }
}
```

### 3. `join()`

- **Description:** Waits for this thread to die.

```java
Thread thread = new Thread(() -> {
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("Thread completed.");
});

thread.start();
try {
    thread.join(); // Main thread waits for 'thread' to complete
    System.out.println("Main thread continues after thread completes.");
} catch (InterruptedException e) {
    e.printStackTrace();
}
```

### 4. `sleep(long millis)`

- **Description:** Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.

```java
class SleepThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread sleeping...");
            Thread.sleep(3000); // Sleep for 3 seconds
            System.out.println("Thread woke up after sleep.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SleepThread thread = new SleepThread();
        thread.start();
    }
}
```

### 5. `interrupt()`

- **Description:** Interrupts this thread.

```java
Thread thread = new Thread(() -> {
    while (!Thread.currentThread().isInterrupted()) {
        System.out.println("Thread running...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
    }
    System.out.println("Thread interrupted. Exiting...");
});

thread.start();
try {
    Thread.sleep(5000); // Main thread waits for 5 seconds
    thread.interrupt(); // Interrupt 'thread'
} catch (InterruptedException e) {
    e.printStackTrace();
}
```

### 6. `isAlive()`

- **Description:** Tests if this thread is alive.

```java
Thread thread = new Thread(() -> {
    System.out.println("Thread running...");
});

thread.start();
System.out.println("Thread alive? " + thread.isAlive()); // Should print true
```

### 7. `yield()`

- **Description:** A hint to the scheduler that the current thread is willing to yield its current use of a processor.

```java
class YieldThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread running...");
            Thread.yield(); // Yield the processor
        }
    }

    public static void main(String[] args) {
        YieldThread thread = new YieldThread();
        thread.start();
    }
}
```

## Synchronized Methods

In Java, synchronization is used to control access to shared resources in a multithreaded environment. Methods can be synchronized using the `synchronized` keyword.

### Synchronized Method Example

```java
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Count: " + counter.getCount()); // Should print 2000
    }
}
```

## Static Synchronized Methods

Static methods can be synchronized using the `synchronized` keyword along with the `static` keyword.

```java
class SharedResource {
    private static int resource = 0;

    public static synchronized void modifyResource() {
        resource++;
    }

    public static synchronized int getResource() {
        return resource;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SharedResource.modifyResource();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SharedResource.modifyResource();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Resource: " + SharedResource.getResource()); // Should print 2000
    }
}
```

## Conclusion

These are some of the important methods provided by the `Thread` class in Java for managing threads, as well as the different ways to create threads and synchronized methods to ensure thread safety. Understanding and utilizing these methods is essential for developing robust multithreaded applications.
