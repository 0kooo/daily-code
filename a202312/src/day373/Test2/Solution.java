package day373.Test2;

//2482. 行和列中一和零的差值
class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] Row = new int[m][2];
        int[][] Col = new int[n][2];
        for (int i = 0; i < m; i++) {
            int one = 0, zero = 0;
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == 1) one++;
                else zero++;
            }
            Row[i][0] = zero;
            Row[i][1] = one;
        }
        for (int i = 0; i < n; i++) {
            int one = 0, zero = 0;
            for (int j = 0; j < m; j++) {
                if(grid[j][i] == 1) one++;
                else zero++;
            }
            Col[i][0] = zero;
            Col[i][1] = one;
        }
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = Row[i][1] + Col[j][1] - Row[i][0] - Row[j][0];
            }
        }
        return res;
    }
}
