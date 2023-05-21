package day217.Test3;

//最后一块石头的重量 II
class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        int m = sum / 2;
        boolean[] dp = new boolean[m + 1];
        dp[0] = true;
        for (int stone : stones) {
            for(int j = m; j >= stone; --j){
                dp[j] = dp[j] || dp[j - stone];
            }
        }
        for(int j = m;;--j){
            if(dp[j]){
                return sum - 2 * j;
            }
        }
    }
}
