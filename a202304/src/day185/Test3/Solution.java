package day185.Test3;


//2006. 差的绝对值为 K 的数对数目
class Solution {
    public int countKDifference(int[] nums, int k) {
        int res = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(Math.abs(nums[i] - nums[j]) == k) res++;
            }
        }
        return res;
    }
}
