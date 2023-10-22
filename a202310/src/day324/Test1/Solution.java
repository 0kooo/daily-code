package day324.Test1;

import java.util.Arrays;

//1402. 做菜顺序
class Solution {
    public int maxSatisfaction(int[] nums) {
        int res = 0, n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            int temp = 0, index = 1;
            for (int j = i; j < n; j++){
                temp += nums[j] * index;
                index++;
            }
            res = Math.max(res, temp);
        }
        return res;
    }
}
