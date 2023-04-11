package day178.Test2;

//1512. 好数对的数目
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int length = nums.length;
        int res = 0;
        for (int i = 0; i < length; i++) {
            for(int j = i + 1; j < length; j++){
                if(nums[i] == nums[j]) res++;
            }
        }
        return res;
    }
}
