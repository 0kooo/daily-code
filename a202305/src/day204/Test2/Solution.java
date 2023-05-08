package day204.Test2;

//485. 最大连续 1 的个数
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int i = 0;
        while (i < nums.length){
            int temp = 0;
            while (i < nums.length && nums[i] == 1){
                i++;
                temp++;
            }
            res = Math.max(res, temp);
            i++;
        }
        return res;
    }
}
