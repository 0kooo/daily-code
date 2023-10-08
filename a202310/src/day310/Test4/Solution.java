package day310.Test4;

import java.util.Arrays;

//2815. 数组中的最大数对和
class Solution {
    public int maxSum(int[] nums) {
        int res = -1;
        var maxVal = new int[10];
        Arrays.fill(maxVal, Integer.MIN_VALUE);
        for (int v : nums) {
            int max = 0;
            for (int i = v; i > 0; i /= 10) max = Math.max(max, i % 10);
            res = Math.max(res, v + maxVal[max]);
            maxVal[max] = Math.max(v, maxVal[max]);
        }
        return res;
    }
}
