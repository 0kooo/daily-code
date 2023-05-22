package day218.Test2;

//2022. 将一维数组转变成二维数组
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] res = new int[m][n];
        int len = original.length;
        if(len != (m * n)) return new int[][]{};
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = original[index++];
            }
        }
        return res;
    }
}
