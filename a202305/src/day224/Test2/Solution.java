package day224.Test2;

import java.util.Arrays;

//2144. 打折购买糖果的最小开销
class Solution {
    public int minimumCost(int[] cost) {
        int res = 0;
        Arrays.sort(cost);
        int n = cost.length;
        for (int i = n - 1; i >= 0; i -= 3) {
            int j = i;
            while (j >= 0 && j > i - 2){
                res += cost[j];
                j--;
            }
        }
        return res;
    }
}
