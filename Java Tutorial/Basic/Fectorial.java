import java.math.BigInteger;
import java.util.concurrent.*;
import java.io.*;

public class Fectorial {
    public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
        int n = 999999;
        int cores = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(cores);

        @SuppressWarnings("unchecked")
        Future<BigInteger>[] futures = new Future[cores];
        for (int i = 0; i < cores; i++) {
            int start = i * (n / cores) + 1;
            int end = (i == cores - 1) ? n : (i + 1) * (n / cores);
            futures[i] = executor.submit(() -> factorialRange(start, end));
        }

        BigInteger result = BigInteger.ONE;
        for (Future<BigInteger> future : futures) {
            result = result.multiply(future.get());
        }

        executor.shutdown();

        // Write the result to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("factorial_result.txt"))) {
            writer.write(result.toString());
        }

        System.out.println("Factorial result has been written to factorial_result.txt");
    }

    private static BigInteger factorialRange(int start, int end) {
        BigInteger result = BigInteger.ONE;
        for (int i = start; i <= end; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
