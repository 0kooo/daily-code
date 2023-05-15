package day211.Test2;

import java.util.Arrays;

//1984. 学生分数的最小差值
class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        for(int i = 0; i + k - 1 < nums.length; i++){
            res = Math.min(nums[i + k - 1] - nums[i], res);
        }
        return res;
    }
}
