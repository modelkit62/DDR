package a4_BestTimetoBuyandSellStock;

public class App {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; ++i) {
            if (prices[i] < minPrice)
                minPrice = prices[i];
            else if (prices[i] - minPrice > maxProfit)
                maxProfit = prices[i] - minPrice;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit_2(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int min = prices[0];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {
            int money = prices[i] - min;
            if (money > max) max = money;
            if (prices[i] < min) min = prices[i];
        }
        return max;
    }
}