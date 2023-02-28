package day136.Text2;

import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length;) {
            res += nums[i];
            i += 2;
        }
        return res;
    }
}