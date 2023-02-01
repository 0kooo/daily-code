package day109.Text1;

class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            if(grid[i][i] == 0 || grid[i][n - 1 - i] == 0){
                return false;
            }else{
                grid[i][i] = 0;
                grid[i][n - 1 - i] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if(grid[i / n][i % n] != 0){
                return false;
            }
        }
        return true;
    }
}
