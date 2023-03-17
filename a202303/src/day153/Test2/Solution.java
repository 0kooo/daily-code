package day153.Test2;

//746 使用最小花费爬楼梯
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int p = 0, c = 0;
        for (int i = 2; i < n; i++) {
            int next = Math.min(c + cost[i - 1], p + cost[i - 2]);
            p = c;
            c = next;
        }
        return c;
    }
}
