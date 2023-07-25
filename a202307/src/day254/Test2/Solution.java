package day254.Test2;

//2210. 统计数组中峰和谷的数量
class Solution {
    public int countHillValley(int[] nums) {
        int res = 0, n = nums.length, flag = 0;
        for (int i = 1; i < n; i++) {
            if(nums[i] > nums[i - 1]){
                if(flag == 1) res++;
                flag = 2;
            }else if(nums[i] < nums[i - 1]){
                if(flag == 2) res++;
                flag = 1;
            }
        }
        return res;
    }
}
