package day264.Test2;

import java.util.Arrays;

//2733. 既不是最小值也不是最大值
class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length == 2 || nums.length == 1) return -1;
        Arrays.sort(nums);
        return nums[1];
    }
}
