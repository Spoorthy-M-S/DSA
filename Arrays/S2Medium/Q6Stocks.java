package DSA.Arrays.S2Medium;

public class Q6Stocks {
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        int n = prices.length;
        for (int i = 1; i < n; i++) {
            profit = Math.max(profit, prices[i] - buy);
            buy = Math.min(buy, prices[i]);
        }
        profit = Math.max(profit, buy - prices[n - 1]);
        return profit;
    }

    public static void main(String[] args) {
        int a[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(a));
    }

}
