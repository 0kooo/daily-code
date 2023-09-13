package day291.Test1;

//2596. 检查骑士巡视方案
class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0] != 0) return false;
        int n = grid.length;
        int[][] arr = new int[n * n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[grid[i][j]][0] = i;
                arr[grid[i][j]][1] = j;
            }
        }
        for (int i = 1; i < n * n; i++){
            int dx = Math.abs(arr[i][0] - arr[i - 1][0]);
            int dy = Math.abs(arr[i][i] - arr[i - 1][1]);
            if(dx * dy != 2) return false;
        }
        return true;
    }
}
