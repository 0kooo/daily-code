package day144.Test1;

class Solution {
    public int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] f = new int[2][n];
        for (int i = 0; i < m; i++) {
            int pos = i % 2;
            for (int j = 0; j < n; j++) {
                f[pos][j] = 0;
                if(i > 0){
                    f[pos][j] = Math.max(f[pos][j], f[1 - pos][j]);
                }
                if(j > 0){
                    f[pos][j] = Math.max(f[pos][j], f[pos][j - 1]);
                }
                f[pos][j] += grid[i][j];
            }
        }
        return f[(m - 1) % 2][n - 1];
    }
}
/*
* class Solution {
    public int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 && j == 0) continue;
                if(i == 0) grid[i][j] += grid[i][j - 1] ;
                else if(j == 0) grid[i][j] += grid[i - 1][j];
                else grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]);
            }
        }

        return grid[m - 1][n - 1];
    }
}
* */