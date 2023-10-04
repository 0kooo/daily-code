package day306.Test1;

//188. 买卖股票的最佳时机 IV
class Solution {
    public int maxProfit(int k, int[] prices) {
        int[] dp = new int[2 * k + 1];
        for(int i = 0; i < 2 * k + 1; i++){
            if(i % 2 == 1){
                dp[i] = -prices[0];
            }
        }

        for(int i = 1; i < prices.length; i++){
            for(int j = 0; j < k; j++){
                dp[2 * j + 1] = Math.max(dp[2 * j + 1], dp[2 * j] - prices[i]);
                dp[2 * j + 2] = Math.max(dp[2 * j + 2], dp[2 * j + 1] + prices[i]);
            }
        }

        return dp[2 * k];
    }
}
