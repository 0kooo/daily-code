package day53.Text1;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if(nums[i] >= target){
                return i;
            }
        }
        return length;
    }
}
