/**
 * Question_4
 */
public class Question_4 {
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 3, 2, 5 };
        System.out.println(Rainwater(height, 1));
    }

    public static int Rainwater(int height[], int width) {
        int n = height.length;
        // left Axiliary Array
        int left_A[] = new int[n];
        left_A[0] = height[0];
        for (int i = 1; i < n; i++) {
            left_A[i] = Math.max(left_A[i - 1], height[i]);
        }
        // right Axiliary Array
        int right_A[] = new int[n];
        right_A[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right_A[i] = Math.max(right_A[i + 1], height[i]);
        }
        // Find Water Lavle
        int RainWater = 0;
        for (int i = 0; i < n; i++) {
            int WaterLavel = Math.min(left_A[i], right_A[i]);
            RainWater += (WaterLavel - height[i]) * width;
        }
        return RainWater;
    }
}