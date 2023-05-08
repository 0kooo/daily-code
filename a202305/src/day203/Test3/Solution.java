package day203.Test3;

import java.util.Arrays;

//414. 第三大的数
class Solution {
    public int thirdMax(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        int n = nums.length;
        int max = nums[n - 1];
        if(n < 3) return max;
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if(max > nums[i]){
                max = nums[i];
                count++;
            }
            if(count == 2) res = nums[i];
        }
        if(count < 2) res = nums[n - 1];
        return res;
    }
}
