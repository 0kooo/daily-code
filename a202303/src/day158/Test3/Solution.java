package day158.Test3;

//922. 按奇偶排序数组 II
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int j = 1;
        for(int i = 0; i < n; i += 2){
            if(nums[i] % 2 == 1){
                while(nums[j] % 2 == 1){
                    j += 2;
                }
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }
}
