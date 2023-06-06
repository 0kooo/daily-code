package day227.Test2;

//2176. 统计数组中相等且可以被整除的数对
class Solution {
    public int countPairs(int[] nums, int k) {
        int res = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(nums[i] == nums[j] && (i * j ) % k == 0) res++;
            }
        }
        return res;
    }
}