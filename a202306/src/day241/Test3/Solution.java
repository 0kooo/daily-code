package day241.Test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1403. 非递增顺序的最小子序列
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        Arrays.sort(nums);
        int temp = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; --i) {
            if(temp > sum / 2) break;
            res.add(nums[i]);
            temp += nums[i];
        }
        return res;
    }
}