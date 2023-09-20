package day296.Test1;

//LCP 06. 拿硬币
class Solution {
    public int minCount(int[] coins) {
        int res = 0;
        for (int coin : coins) {
            res += coin / 2;
            res += coin % 2;
        }
        return res;
    }
}
