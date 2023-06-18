package day233.Test1;

//213. ´ò¼Ò½ÙÉá II
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        else if(n == 2) return Math.max(nums[0], nums[1]);
        return Math.max(dfs(nums, 0, n - 2), dfs(nums, 1, n - 1));
    }

    private int dfs(int[] nums, int start, int end) {
        int first = nums[start], sc = Math.max(nums[start], nums[end]);
        for (int i = start + 2; i <= end; i++){
            int temp = sc;
            sc = Math.max(first + nums[i], sc);
            first = temp;
        }
        return sc;
    }
}