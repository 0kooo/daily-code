package day307.Test1;

//309. 买卖股票的最佳时机含冷冻期
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] arr = new int[n][3];
        arr[0][0] = -prices[0];
        for (int i = 1; i < n; i++) {
            arr[i][0] = Math.max(arr[i - 1][0], arr[i - 1][2] - prices[i]);
            arr[i][1] = arr[i - 1][0] + prices[i];
            arr[i][2] = Math.max(arr[i - 1][1], arr[i - 1][2]);
        }
        return Math.max(arr[n - 1][1], arr[n - 1][2]);
    }
}
