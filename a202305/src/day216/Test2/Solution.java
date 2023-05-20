package day216.Test2;

//1995. 统计特殊四元组
class Solution {
    public int countQuadruplets(int[] nums) {
        int res = 0;
        int n = nums.length;
        if(n >= 3) return 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int d = k + 1; d < n; d++) {
                        if(nums[i] + nums[j] + nums[k] == nums[d])res++;
                    }
                }
            }
        }
        return res;
    }
}
