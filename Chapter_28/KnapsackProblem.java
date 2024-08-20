import java.util.Arrays;
import java.util.Comparator;

public class KnapsackProblem {
    public static void main(String[] args) {
        // Test case 1
        int[] values1 = { 60, 100, 120 }; // Values of the items
        int[] weights1 = { 10, 20, 30 }; // Weights of the items
        int capacity1 = 50; // Capacity of the knapsack
        System.out.println("Test Case 1");
        System.out.println("Max value: " + knapsack(values1, weights1, capacity1));

        // Test case 2
        int[] values2 = { 20, 30, 50 }; // Values of the items
        int[] weights2 = { 15, 25, 35 }; // Weights of the items
        int capacity2 = 40; // Capacity of the knapsack
        System.out.println("Test Case 2");
        System.out.println("Max value: " + knapsack(values2, weights2, capacity2));
    }

    public static double knapsack(int[] values, int[] weights, int capacity) {
        int n = weights.length;
        double[][] ratio = new double[n][2];

        for (int i = 0; i < n; i++) {
            ratio[i][0] = i; // Index of the item
            ratio[i][1] = (double) values[i] / weights[i]; // Value-to-weight ratio
        }

        // Sort by ratio in descending order
        // Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));
        // Arrays.sort(ratio,Comparator.comparingDouble((double[] o)->o[1]).reversed());
        // Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        Arrays.sort(ratio,new Comparator<>(){
            public int compare(double[] a,double b[]){
                return Double.compare(b[1], a[1]);
            }
        });

        double maxProfit = 0.0;

        for (int i = 0; i < n; i++) {
            int index = (int) ratio[i][0];
            int val = values[index];
            int wei = weights[index];

            if (capacity >= wei) {
                maxProfit += val;
                capacity -= wei;
            } else {
                maxProfit += (val * ((double) capacity / wei));
                capacity = 0;
            }

            if (capacity == 0)
                break; // No more capacity left
        }

        return maxProfit;
    }
}
