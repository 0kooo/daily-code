package day216.Test1;

//861. 翻转矩阵后的得分
class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int ret = m * (1 << (n - 1));
        for (int i = 1; i < n; i++) {
            int temp = 0;
            for (int j = 0; j < m; j++) {
                if(grid[i][0] == 1){
                    temp += grid[i][j];
                }else{
                    temp += (1 - grid[i][j]);
                }
            }
            int k = Math.max(temp, m - temp);
            ret += k * (1 << (n - i - 1));
        }
        return ret;
    }
}
