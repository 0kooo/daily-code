package day250.Test3;

//1800. 最大升序子数组和
class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int res = 0, l = 0;
        while (l < n){
            int temp = nums[l++];
            while (l < n && nums[l] > nums[l - 1]){
                temp += nums[l++];
            }
            res = Math.max(res, temp);
        }
        return res;
    }
}
