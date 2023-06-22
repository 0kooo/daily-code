package day238.Test3;

import java.util.ArrayList;
import java.util.List;

//1380. 矩阵中的幸运数
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[] max = new int[m];
        int[] min = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            int temp = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                temp = Math.min(temp, matrix[i][j]);
            }
            min[index++] = temp;
        }
        index = 0;
        for (int i = 0; i < m; i++) {
            int temp = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                temp = Math.max(temp, matrix[j][i]);
            }
            max[index++] = temp;
        }
        List<Integer> res = new ArrayList<>();
        for (int j : min) {
            for (int k : max) {
                if (j == k) res.add(j);
            }
        }
        return res;
    }
}