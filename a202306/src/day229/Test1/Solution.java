package day229.Test1;

import java.util.Arrays;

//1561. 你可以获得的最大硬币数目
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length;
        int res = 0, index = n - 2;
        for (int i = 0; i < n / 3; i++){
            res += piles[index];
            index -= 2;
        }
        return res;
    }
}
