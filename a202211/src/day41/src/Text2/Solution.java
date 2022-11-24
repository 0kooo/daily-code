package Text2;

import java.util.Arrays;

class Solution {
    public int smallestRangeII(int[] nums, int k) {
        int length = nums.length;
        Arrays.sort(nums);
        int res = nums[length - 1] - nums[0];
        for (int i = 0; i < length - 1; i++) {
            int a = nums[i];
            int b = nums[i + 1];
            int h = Math.max(nums[length - 1] - k, a + k);
            int l = Math.min(nums[0] + k, b - k);
            res = Math.min(res, h - l);
        }
        return res;
    }
}