package day229.Test2;

import java.util.Arrays;

//2500. 删除每行中的最大值
class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            Arrays.sort(grid[i]);
        }
        int res = 0;
        for (int i = m - 1; i >= 0; i--){
            int[] temp = new int[n];
            for (int j = 0; j < n; j++){
                temp[j] = grid[j][i];
            }
            Arrays.sort(temp);
            res += temp[n - 1];
        }
        return res;
    }
}
