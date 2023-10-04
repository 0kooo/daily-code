package day306.Test4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

//1030. 距离顺序排列矩阵单元格
class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ret = new int[rows * cols][];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ret[i * cols + j] = new int[]{i, j};
            }
        }
        Arrays.sort(ret, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (Math.abs(o1[0] - rCenter) + Math.abs(o1[1] - cCenter)) - (Math.abs(o2[0] - rCenter) + Math.abs(o2[1] - cCenter));
            }
        });
        return ret;
    }
}