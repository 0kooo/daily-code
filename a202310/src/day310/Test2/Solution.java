package day310.Test2;

import java.util.Arrays;

//41. 缺失的第一个正数
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length, res = 0;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]){
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if(nums[i] != i + 1){
                return i + 1;
            }
        }
        return n + 1;
    }
}
