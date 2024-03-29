package day332.Test2;

//553. 最优除法
class Solution {
    public String optimalDivision(int[] nums) {
        int n = nums.length;
        if(n == 1) return String.valueOf(nums[0]);
        if(n == 2) return String.valueOf(nums[0]) + "/" + String.valueOf(nums[1]);
        StringBuilder res = new StringBuilder();
        res.append(nums[0]);
        res.append("/(");
        res.append(nums[1]);
        for (int i = 2; i < n; i++) {
            res.append("/");
            res.append(nums[i]);
        }
        res.append(")");
        return res.toString();
    }
}
