package day266.Test3;

//695. 岛屿的最大面积
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                res = Math.max(res, dfs(grid, i, j));
            }
        }
        return res;
    }

    private int dfs(int[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] != 1){
            return 0;
        }
        grid[i][j] = 0;
        int[] di = {0, 0, 1, -1};
        int[] dj = {1, -1, 0, 0};
        int res = 1;
        for (int index = 0; index != 4; index++){
            int nextI = di[index] + i, nextJ = dj[index] + j;
            res += dfs(grid, nextI, nextJ);
        }
        return res;
    }
}
