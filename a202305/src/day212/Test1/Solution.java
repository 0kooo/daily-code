package day212.Test1;

//1004. 最大连续1的个数 III
class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0, lsum = 0, rsum = 0;
        int res = 0;
        for (int right = 0; right < n; ++right){
            rsum += 1 - nums[right];
            while (lsum < rsum - k){
                lsum += 1 - nums[left];
                ++left;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
