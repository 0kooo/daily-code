package day292.Test1;

import java.util.Arrays;

//LCP 50. 宝石补给
class Solution {
    public int giveGem(int[] gem, int[][] operations) {
        for (int[] operation : operations) {
            int x = operation[0];
            int y = operation[1];
            int temp = gem[x] / 2;
            gem[y] += temp;
            gem[x] = gem[x] - temp;
        }
        Arrays.sort(gem);
        return gem[gem.length - 1] - gem[0];
    }
}
