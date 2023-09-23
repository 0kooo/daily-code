package day298.Test2;

//643. 子数组最大平均数 I
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) sum += nums[i];
        int max = sum;
        for (int i = k; i < nums.length; i++){
            sum = sum - nums[i - k] + nums[i];
            max = Math.max(sum, max);
        }
        return 1.0 * max / k;
    }
}
