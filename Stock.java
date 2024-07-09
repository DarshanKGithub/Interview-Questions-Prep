//Q2)Best time to buy and sell stock(at most transaction allowed)

public class Stock {
    public int maxStockProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;// Buying
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        // System.out.println(maxProfit);
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        Stock stock = new Stock();
        int profit = stock.maxStockProfit(prices);
        System.out.println(profit);
    }

}
