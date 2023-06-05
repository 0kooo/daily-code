package day226.Test1;

//2460. 对数组执行操作
class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for (int i = 0, j = 0; i < n; i++) {
            if(i < n + 1 && nums[i] == nums[i + 1]){
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
            if(nums[i] != 0){
                swap(nums, i, j);
                j++;
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
