package day244.Test3;

//1480. 一维数组的动态和
class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += nums[i];
            }
            res[i] = sum;
        }
        return res;
    }
}
