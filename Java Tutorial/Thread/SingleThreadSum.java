public class SingleThreadSum {
    public static void main(String[] args) {
        int[] numbers = new int[1000000000]; // Array with 1000 million elements
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        long startTime = System.currentTimeMillis();

        long sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Sum: " + sum);
        System.out.println("Total Time of execution (Single Thread) = " + (endTime - startTime) + " ms");
    }
}
