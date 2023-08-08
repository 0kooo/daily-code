package day265.Test3;

//2778. 特殊元素平方和
class Solution {
    public int sumOfSquares(int[] nums) {
        int res = 0, n = nums.length;
        for (int i = 1; i <= n; i++){
            if(n % i == 0) res += (nums[i - 1] * nums[i - 1]);
        }
        return res;
    }
}