package day259.Test2;

import java.util.Arrays;

//2656. K 个元素的最大和
class Solution {
    public int maximizeSum(int[] nums, int k) {
        int res = 0;
        int max = Arrays.stream(nums).max().getAsInt();
        for (int i = max; i < max + k; i++){
            res += i;
        }
        return res;
    }
}
