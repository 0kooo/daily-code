package day265.Test1;

//1749. 任意子数组和的绝对值的最大值
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int res = 0, max = 0, min = 0;
        for (int num : nums) {
            max = Math.max(max, 0) + num;
            min = Math.min(min, 0) + num;
            res = Math.max(res, Math.max(max, -min));
        }
        return res;
    }
}