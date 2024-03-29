package day174.Test1;


import java.util.Arrays;

//1040. 移动石子直到连续 II
class Solution {
    public int[] numMovesStonesII(int[] stones) {
        int n = stones.length;
        Arrays.sort(stones);
        if(stones[n - 1] - stones[0] + 1 == n) return new int[]{0, 0};
        int max = Math.max(stones[n - 2] - stones[0] + 1, stones[n - 1] - stones[1] + 1) - (n - 1);
        int min = n;
        for(int i = 0, j = 0; i < n && j + 1 < n; ++i){
            while (j + 1 < n && stones[j + 1] - stones[i] + 1 <= n){
                ++j;
            }
            if(j - i + 1 == n - 1 && stones[j] - stones[i] + 1 == n - 1) min = Math.min(min, 2);
            else min = Math.min(min, n - (j - i + 1));
        }
        return new int[]{min, max};
    }
}
