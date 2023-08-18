package day275.Test1;

import java.util.Arrays;

//1388. 3n 块披萨
class Solution {
    public int maxSizeSlices(int[] slices) {
        int n = slices.length;
        int[] v1 = new int[n - 1];
        int[] v2 = new int[n - 1];
        System.arraycopy(slices, 1, v1, 0, n - 1);
        System.arraycopy(slices, 0, v2, 0, n - 1);
        int res1 = calculate(v1);
        int res2 = calculate(v2);
        return Math.max(res1, res2);
    }

    private int calculate(int[] arr) {
        int m = arr.length, n = (m + 1) / 3;
        int[][] dp = new int[m][n + 1];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }
        dp[0][0] = 0;
        dp[0][1] = arr[0];
        dp[1][0] = 0;
        dp[1][1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < m; i++){
            dp[i][0] = 0;
            for (int j = 1; j <= n; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 2][j - 1] + arr[i]);
            }
        }
        return dp[m - 1][n];
    }
}