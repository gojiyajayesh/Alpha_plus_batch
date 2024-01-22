/**
 * TrappingRaintwaterAxiliaryArray
 */
public class TrappingRaintwaterAxiliaryArray {

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int RaintWater = rainWater(height);
        System.out.println("Rainwater is = " + RaintWater+" m^2");
    }

    public static int rainWater(int height[]) {
        int n = height.length;

        // left_max Array
        int L_max[] = new int[n];
        L_max[0] = height[0];
        for (int i = 1; i < n; i++) {
            L_max[i] = Math.max(L_max[i - 1], height[i]);
        }

        // right_max Array
        int R_max[] = new int[n];
        R_max[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            R_max[i] = Math.max(R_max[i + 1], height[i]);
        }

        int rainWater = 0;
        for (int i = 0; i < n; i++) {
            // water lavel
            int waterlavel = Math.min(L_max[i], R_max[i]);
            // rain water
            rainWater += (waterlavel - height[i]);
        }
        return rainWater;
    }
}