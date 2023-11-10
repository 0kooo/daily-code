package day343.Test2;

//983. 最低票价
class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length, maxDay = days[n - 1], minDay = days[0];
        int[] dp = new int[maxDay + 31];
        for (int d = maxDay, i = n - 1; d >= minDay; d--){
            if(d == days[i]){
                dp[d] = Math.min(dp[i + 1] + costs[0], dp[i + 7] + costs[1]);
                dp[d] = Math.min(dp[d], dp[i + 30] + costs[2]);
            }else dp[d] = dp[d + 1];
        }
        return dp[minDay];
    }
}
