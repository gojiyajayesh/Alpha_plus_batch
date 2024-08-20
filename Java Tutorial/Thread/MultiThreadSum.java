public class MultiThreadSum {
    public static void main(String[] args) {
        int[] numbers = new int[1000000000]; // Array with 1000 million elements
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        int numberOfThreads = 10;
        SumThread[] threads = new SumThread[numberOfThreads];
        int chunkSize = numbers.length / numberOfThreads;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numberOfThreads - 1) ? numbers.length : start + chunkSize;
            threads[i] = new SumThread(numbers, start, end);
            threads[i].start();
        }

        long totalSum = 0;
        try {
            for (SumThread thread : threads) {
                thread.join();
                totalSum += thread.getSum();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Sum: " + totalSum);
        System.out.println("Total Time of execution (Multi-Thread) = " + (endTime - startTime) + " ms");
    }
}

class SumThread extends Thread {
    private int[] numbers;
    private int start;
    private int end;
    private long sum;

    public SumThread(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    public void run() {
        sum = 0;
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
    }

    public long getSum() {
        return sum;
    }
}
