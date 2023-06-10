package day231.Test2;

//1252. 奇数值单元格的数目
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for (int[] index : indices) {
            for (int i = 0; i < n; i++) {
                arr[index[0]][i]++;
            }
            for (int i = 0; i < m; i++) {
                arr[i][index[1]]++;
            }
        }
        int res = 0;
        for (int[] temp : arr) {
            for (int i : temp) {
                if(i % 2 == 1) res++;
            }
        }
        return res;
    }
}