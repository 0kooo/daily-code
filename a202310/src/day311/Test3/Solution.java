package day311.Test3;

//516. 最长回文子序列
class Solution {
    public int longestPalindromeSubseq(String s) {
        char[] arr = s.toCharArray();
        int n = s.length();
        int[][] res  = new int[n][n];
        for (int i = n - 1; i >= 0; --i){
            res[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) res[i][j] = res[i + 1][j - 1] + 2;
                else res[i][j] = Math.max(res[i + 1][j], res[i][j - 1]);
            }
        }
        return res[0][n - 1];
    }
}
