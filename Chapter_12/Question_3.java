/**
 * Question_3
 */
public class Question_3 {
    public static void main(String[] args) {
        int price[] = { 7, 1, 4, 3, 1 };
        System.out.println(profit(price));
    }

    public static int profit(int price[]) {
        int profit = 0;
        // First Day Only Buy Stock
        int buying = price[0];
        // Find Profit
        for (int i = 1; i < price.length; i++) {
            if (buying < price[i])
                profit = Math.max(price[i] - buying, profit);
            else
                buying = price[i];
        }
        return profit;
    }
}