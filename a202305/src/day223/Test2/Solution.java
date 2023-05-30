package day223.Test2;

//2016. 增量元素之间的最大差值
class Solution {
    public int maximumDifference(int[] nums) {
        int res = -1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int dief = nums[j] - nums[i];
                if(dief > 0){
                    res = Math.max(dief, res);
                }
            }
        }
        return res;
    }
}
