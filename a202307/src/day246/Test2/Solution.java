package day246.Test2;

//1582. 二进制矩阵中的特殊位置
class Solution {
    public int numSpecial(int[][] mat) {
        int res = 0;
        int m = mat.length, n = mat[0].length;
        int[] row = new int[m];
        int[] cols = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                row[i] += mat[i][j];
                cols[j] += mat[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j] == 1 && row[i] == 1 && cols[j] == 1) res++;
            }
        }
        return res;
    }
}