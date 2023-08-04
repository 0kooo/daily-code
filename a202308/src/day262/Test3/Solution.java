package day262.Test3;

//807. 保持城市天际线
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] r = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                r[i] = Math.max(grid[i][j], r[i]);
                c[j] = Math.max(grid[i][j], c[j]);
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res += Math.min(r[i], c[j]) - grid[i][j];
            }
        }
        return res;
    }
}