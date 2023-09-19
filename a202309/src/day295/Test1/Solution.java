package day295.Test1;

import java.util.Arrays;

//2560. 打家劫舍 IV
class Solution {
    public int minCapability(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        while (max >= min){
            int mid = (min + max) / 2;
            int count = 0;
            boolean flag = false;
            for (int n : nums) {
                if(n <= mid && !flag){
                    count++;
                    flag = true;
                }else flag = false;
            }
            if(count >= k) max = mid - 1;
            else min = mid + 1;
        }
        return min;
    }
}