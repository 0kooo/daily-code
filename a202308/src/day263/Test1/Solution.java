package day263.Test1;

import java.util.Arrays;

//2706. 购买两块巧克力
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int res = money - prices[0] - prices[1];
        return res >= 0 ? res : money;
    }
}
