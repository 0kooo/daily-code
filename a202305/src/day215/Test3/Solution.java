package day215.Test3;

//486. 预测赢家
class Solution {
    public boolean PredictTheWinner(int[] nums) {
        return total(nums, 0, nums.length - 1) >= 0;
    }

    private int total(int[] nums, int start, int end) {
        if(start == end){
            return nums[start];
        }
        int startMax = nums[start] - total(nums, start + 1, end);
        int endMax = nums[end] - total(nums, start, end - 1);
        return Math.max(startMax, endMax);
    }
}
