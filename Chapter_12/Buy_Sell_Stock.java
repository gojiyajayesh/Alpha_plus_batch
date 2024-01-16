/**
 * Buy_Sell_Stock
 */
public class Buy_Sell_Stock {
    public static void main(String[] args) {
            int price[]={1,2,3,4,5,6,7,8,9};
            System.out.println(profit(price));
    }
    public static int profit(int price[]) {
        int buying_price = price[0];
        int profit = 0, sell = 0;
        for (int i = 1; i < price.length; i++) {
            sell = price[i] - buying_price;
            if (sell > profit)
                profit = sell;
            if (buying_price > price[i])
                buying_price = price[i];
        }
        return profit;
    }
}