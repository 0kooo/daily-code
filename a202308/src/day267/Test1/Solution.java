package day267.Test1;


//1289. 下降路径最小和 II
class Solution {
    public int minFallingPathSum(int[][] grid) {
        int res = Integer.MAX_VALUE;
        int n = grid.length;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.MAX_VALUE;
            }
        }
        System.arraycopy(grid[0], 0, arr[0], 0, n);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if(j == k) continue;
                    arr[i][j] = Math.min(arr[i][j], arr[i - 1][k] + grid[i][j]);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            res = Math.min(res, arr[n - 1][i]);
        }
        return res;
    }
}
