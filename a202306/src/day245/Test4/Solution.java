package day245.Test4;

import java.util.Arrays;

//1679. K 和数对的最大数目
class Solution {
    public int maxOperations(int[] nums, int k) {
        int res = 0;
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left < right){
            int sum = nums[left] + nums[right];
            if(sum < k){
                left++;
            }else if(sum > k){
                right--;
            }else{
                right--;
                left++;
                res++;
            }
        }
        return res;
    }
}
