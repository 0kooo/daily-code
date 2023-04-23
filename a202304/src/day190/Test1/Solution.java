package day190.Test1;

import java.util.Arrays;

//1105. 填充书架
class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int n = books.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 1000000);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            int max = 0, width = 0;
            for(int j = i; j >= 0; --j){
                width += books[j][0];
                if(width > shelfWidth){
                    break;
                }
                max = Math.max(max, books[j][1]);
                dp[i + 1] = Math.min(dp[i + 1], dp[j] + max);
            }
        }
        return dp[n];
    }
}
