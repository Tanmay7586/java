package Arrays;

public class _7BestTImeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 5, 3, 6, 4, 1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {  //for buying
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) { // for selling
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
