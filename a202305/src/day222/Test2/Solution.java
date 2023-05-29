package day222.Test2;

//1219. 黄金矿工
class Solution {
    static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int[][] grid;
    int m, n;
    int res = 0;
    public int getMaximumGold(int[][] grid) {
        this.grid = grid;
        this.m = grid.length;
        this.n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] != 0){
                    dfs(i, j, 0);
                }
            }
        }
        return res;
    }

    private void dfs(int x, int y, int gold){
        gold += grid[x][y];
        res = Math.max(res, gold);
        int rec = grid[x][y];
        grid[x][y] = 0;
        for (int d = 0; d < 4; ++d){
            int nx = x + dirs[d][0];
            int ny = y + dirs[d][1];
            if(nx >= 0 && nx < m && ny >= 0 && ny < n && grid[nx][ny] > 0){
                dfs(nx, ny, gold);
            }
        }
        grid[x][y] = rec;
    }
}
