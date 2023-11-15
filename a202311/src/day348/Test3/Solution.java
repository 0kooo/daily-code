package day348.Test3;

//1014. 最佳观光组合
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int res = 0, max = values[0];
        for (int i = 1; i < values.length; i++) {
            res = Math.max(res, max + values[i] - i);
            max = Math.max(max, values[i] + i);
        }
        return res;
    }
}