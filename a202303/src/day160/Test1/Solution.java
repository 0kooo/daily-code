package day160.Test1;

import java.util.Arrays;

//977 有序数组的平方
class Solution {
    public int[] sortedSquares(int[] nums) {
        /*for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;*/
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0, j = n - 1, index = n - 1; i <= j;){
            if(nums[i] * nums[i] > nums[j] * nums[j]){
                res[index] = nums[i] * nums[i];
                i++;
            }else{
                res[index] = nums[j] * nums[j];
                j--;
            }
            index--;
        }
        return res;
    }
}
