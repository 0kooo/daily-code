package day189.Test1;

import java.util.Arrays;

//1027. 最长等差数列
class Solution {
    public int longestArithSeqLength(int[] nums) {
        int minv = Arrays.stream(nums).min().getAsInt();
        int maxv = Arrays.stream(nums).max().getAsInt();
        int diff = maxv - minv;
        int res = 1;
        for(int d = -diff; d <= diff; ++d){
            int[] f = new int[maxv + 1];
            Arrays.fill(f, -1);
            for(int num : nums){
                int prev = num - d;
                if(prev >= minv && prev <= maxv && f[prev] != -1){
                    f[num] = Math.max(f[num], f[prev] + 1);
                    res = Math.max(res, f[num]);
                }
                f[num] = Math.max(f[num], 1);
            }
        }
        return res;
    }
}
