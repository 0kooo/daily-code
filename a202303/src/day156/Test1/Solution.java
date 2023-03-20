package day156.Test1;

//905. 按奇偶排序数组
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left < right){
            if(nums[left] % 2 != 1){
                left++;
                continue;
            }
            if(nums[right] % 2 != 0){
                right--;
                continue;
            }
            if(nums[left] % 2 == 1 && nums[right] % 2 == 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }
}
/*
* class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            while(left < right && nums[right] % 2 != 0) {
                right--;
            }
            while(left < right && nums[left] % 2 == 0) {
                left++;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;

        }
        return nums;
    }
}
* */