package day258.Test3;

import java.util.Arrays;

//2644. 找出可整除性得分最大的整数
class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int n = nums.length, m = divisors.length;
        Arrays.sort(divisors);
        int res = divisors[0], max = 0;
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(nums[j] % divisors[i] == 0) count++;
            }
            if(count > max){
                max = count;
                res = divisors[i];
            }
        }
        return res;
    }
}
