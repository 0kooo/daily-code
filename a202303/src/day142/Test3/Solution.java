package day142.Test3;

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ret = 1;
        int temp = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] - nums[i - 1] > 0){
                temp++;
            }else{
                temp = 1;
            }
            ret = Math.max(ret, temp);
        }
        return ret;
    }
}
