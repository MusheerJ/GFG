public class BuySellStock {
    public static void main(String[] args) {

        int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices, prices.length));
    }

    static public int maxProfit(int[] nums, int n) {

        int maxProfit = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            min = Integer.min(min, nums[i]);

            maxProfit = Integer.max(maxProfit, nums[i] - min);
        }

        return maxProfit;

    }

    static public int maxProfit(int[] prices) {

        // Musheer Logic
        int maxProfit = Integer.MIN_VALUE;

        int minPrice = prices[0];
        int maxPrice = prices[prices.length - 1];

        int[] buy = new int[prices.length];
        int[] sell = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            minPrice = Integer.min(minPrice, prices[i]);
            buy[i] = minPrice;

        }

        for (int i = prices.length - 1; i >= 0; i--) {
            maxPrice = Integer.max(maxPrice, prices[i]);
            sell[i] = maxPrice;
        }

        for (int i = 0; i < prices.length; i++) {
            maxProfit = Integer.max(maxProfit, sell[i] - buy[i]);
        }
        return maxProfit;

    }
}
