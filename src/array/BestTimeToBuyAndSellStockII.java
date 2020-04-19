package array;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int max = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                max += prices[i] - prices[i - 1];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,1,5,3,6,4};

        int i = new BestTimeToBuyAndSellStockII().maxProfit(arr);
        System.out.println(i);
    }
}
