package day250.Test2;

//1752. 检查数组是否经排序和轮转得到
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length, x = 0;
        for (int i = 1; i < n; i++) {
            if(nums[i] < nums[i - 1]){
                x = i;
                break;
            }
        }
        if(x == 0) return true;
        for (int i = x + 1; i < n; i++){
            if(nums[i] < nums[i - 1]) return false;
        }
        return nums[0] >= nums[n - 1];
    }
}
