package problem_121;
// 买卖股票的最佳时机
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0], max = 0;
        for(int i = 0; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }
}
