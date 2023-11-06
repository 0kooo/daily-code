package day339.Test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//368. 最大整除子集
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxSize = 1, maxvalue = nums[0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i] % nums[j] == 0) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            if(dp[i] > maxSize){
                maxSize = dp[i];
                maxvalue = nums[i];
            }
        }
        List<Integer> res = new ArrayList<>();
        if(maxSize == 1) {
            res.add(nums[0]);
            return res;
        }
        for (int i = n - 1; i >=0 && maxSize > 0; i--){
            if(dp[i] == maxSize && maxvalue % nums[i] == 0){
                res.add(nums[i]);
                maxvalue = nums[i];
                maxSize--;
            }
        }
        return res;
    }
}
