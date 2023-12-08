package day370.Test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//2008. 出租车的最大盈利
class Solution {
    public long maxTaxiEarnings(int n, int[][] rides) {
        long[] dp = new long[n + 1];
        Map<Integer, List<int[]>> mapRide = new HashMap<>();
        for (int[] ride : rides) {
            mapRide.putIfAbsent(ride[1], new ArrayList<>());
            mapRide.get(ride[1]).add(ride);
        }
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1];
            for (int[] ride : mapRide.getOrDefault(i, new ArrayList<>())) {
                dp[i] = Math.max(dp[i], dp[ride[0]] + ride[1] - ride[0] + ride[2]);
            }
        }
        return dp[n];
    }
}
