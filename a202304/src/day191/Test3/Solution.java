package day191.Test3;

import java.util.Arrays;

//2154. 将找到的值乘以 2
class Solution {
    public int findFinalValue(int[] nums, int original) {
        int res = original;
        Arrays.sort(nums);
        for (int num : nums) {
            if(res == num){
                res *= 2;
            }
        }
        return res;
    }
}
