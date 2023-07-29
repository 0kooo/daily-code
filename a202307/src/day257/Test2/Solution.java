package day257.Test2;

//2639. 查询网格图中每一列的宽度
class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int n = grid[0].length;
        int m = grid.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                int sign = grid[j][i];
                String temp = "" + sign;
                max = Math.max(max, temp.length());
            }
            res[i] = max;
        }
        return res;
    }
}
