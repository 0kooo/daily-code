package day266.Test2;

import java.util.Arrays;

//2784. 检查数组是否是好的
class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int max = Arrays.stream(nums).max().getAsInt();
        if(max + 1 != n) return false;
        Arrays.sort(nums);
        for (int i = 0; i < n - 1; i++) {
            if(i != n - 2 && nums[i] == nums[i + 1])return false;
        }
        return true;
    }
}
