package day131.Text2;

class Solution {
    public int stoneGameII(int[] piles) {
        int length = piles.length;
        int sum = 0;
        int[][] dp = new int[length][length + 1];
        for(int i = length - 1; i >= 0; i--){
            sum += piles[i];
            for (int j = 1; j <= length; j++) {
                if(i + 2 * j >= length){
                    dp[i][j] = sum;
                }else{
                    for (int k = 1; k <= 2 * j; k++) {
                        dp[i][j] = Math.max(dp[i][j], sum - dp[i + k][Math.max(j, k)]);
                    }
                }
            }
        }
        return dp[0][1];
    }
}
