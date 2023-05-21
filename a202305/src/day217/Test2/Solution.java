package day217.Test2;

import java.util.Arrays;

//1005. K 次取反后最大化的数组和
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int res = 0, min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0 && k != 0){
                nums[i] = Math.abs(nums[i]);
                k--;
            }
            min = Math.min(min, nums[i]);
            res += nums[i];
        }
        return res - (k % 2 == 0 ? 0 : 2 * min);
    }
}
