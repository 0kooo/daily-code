package day256.Test3;

//152. 乘积最大子数组
class Solution {
    public int maxProduct(int[] nums) {
        int maxF = nums[0], minF = nums[0], res = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++){
            int max = maxF, min = minF;
            maxF = Math.max(max * nums[i], Math.max(nums[i], min * nums[i]));
            minF = Math.min(min * nums[i], Math.min(nums[i], max * nums[i]));
            res = Math.max(res, maxF);
        }
        return res;
    }
}
