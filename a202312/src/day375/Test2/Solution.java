package day375.Test2;

//2221. 数组的三角和
class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        dp[0] = nums;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++){
                dp[i][j] = (dp[i - 1][j] + dp[i - 1][j + 1]) % 10;
            }
        }
        return dp[n - 1][0];
    }
}