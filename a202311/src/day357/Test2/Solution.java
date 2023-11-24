package day357.Test2;

//474. 一和零
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String str : strs) {
            int[] arr = getZO(str);
            int one = arr[1], zero = arr[0];
            for (int i = m; i >= zero; i--){
                for (int j = n; j >= one; j--){
                    dp[i][j] = Math.max(dp[i][j], dp[i - zero][j - one] + 1);
                }
            }
        }
        return dp[m][n];
    }

    private int[] getZO(String str) {
        int[] res = new int[2];
        for (int i = 0; i < str.length(); i++) {
            res[str.charAt(i) - '0']++;
        }
        return res;
    }
}
