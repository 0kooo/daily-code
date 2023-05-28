package day221.Test3;

//892. 三维形体的表面积
class Solution {
    public int surfaceArea(int[][] grid) {
        int[] dr = new int[]{0, 1, 0, -1};
        int[] dc = new int[]{1, 0, -1, 0};
        int n = grid.length, res =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] > 0){
                    res += 2;
                    for (int k = 0; k < 4; k++) {
                        int nr = i + dr[k];
                        int nc = j + dc[k];
                        int nv = 0;
                        if(0 <= nr && nr < n && 0 <= nc && nc < n){
                            nv = grid[nr][nc];
                        }
                        res += Math.max(grid[i][j] - nv, 0);
                    }
                }
            }
        }
        return res;
    }
}
