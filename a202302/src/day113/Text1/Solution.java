package day113.Text1;

import java.util.Arrays;

class Solution {
    public int getMaximumConsecutive(int[] coins) {
        int res = 1;
        Arrays.sort(coins);
        for (int coin : coins) {
            if(coin > res){
                break;
            }
            res += coin;
        }
        return res;
    }
}
