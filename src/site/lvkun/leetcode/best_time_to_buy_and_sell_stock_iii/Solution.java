package site.lvkun.leetcode.best_time_to_buy_and_sell_stock_iii;

// TODO: retry
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int[] local = new int[3];
        int[] global = new int[3];

        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            for (int j = 2; j >= 1; j--) {
                local[j] = Math.max(global[j - 1] + Math.max(diff, 0),
                        local[j] + diff);
                global[j] = Math.max(local[j], global[j]);
            }
        }

        return global[2];
    }
}