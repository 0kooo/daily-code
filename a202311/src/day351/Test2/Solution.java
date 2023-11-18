package day351.Test2;

//416. 分割等和子集
class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        if(n < 2) return false;
        int sum = 0, max = 0;
        for (int num : nums) {
            sum += num;
            max = Math.max(max, num);
        }
        int target = sum / 2;
        if(max > target || sum % 2 != 0) return false;
        boolean[][] dp = new boolean[n][target + 1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }
        dp[0][nums[0]] = true;
        for (int i = 1; i < n; i++) {
            int num = nums[i];
            for (int j = 1; j <= target; j++) {
                if(j > nums[i]) dp[i][j] = dp[i - 1][j] || dp[i - 1][j - num];
                else dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n - 1][target];
    }
}
