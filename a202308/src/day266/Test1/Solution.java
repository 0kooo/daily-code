package day266.Test1;

//2765. 最长交替子序列
class Solution {
    public int alternatingSubarray(int[] nums) {
        int res = -1, n = nums.length;
        int i = 0;
        while (i < n - 1){
            if(nums[i + 1] - nums[i] != 1){
                i++;
                continue;
            }
            int temp = i;
            i++;
            while(i < n && nums[i] == nums[temp + (i - temp) % 2]){
                i++;
            }
            res = Math.max(res, i - temp);
            i--;
        }
        return res;
    }
}