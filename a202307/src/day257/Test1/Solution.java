package day257.Test1;

//2614. 对角线上的质数
class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int num1 = nums[i][i];
            int num2 = nums[i][n - i - 1];
            if(dfs(num2)) res = Math.max(res, num2);
            if(dfs(num1)) res = Math.max(res, num1);
        }
        return res;
    }

    private boolean dfs(int num) {
        for (int i = 2; i * i< num; i++){
            if(num % i == 0) return false;
        }
        return num >= 2;
    }
}
