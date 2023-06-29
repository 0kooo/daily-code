package day243.Test3;

//1464. 数组中两元素的最大乘积
class Solution {
    public int maxProduct(int[] nums) {
        int res = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                res = Math.max(res, (nums[i] - 1) * (nums[j] - 1));
            }
        }
        return res;
    }
}
