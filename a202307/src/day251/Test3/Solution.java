package day251.Test3;

import java.util.Arrays;

//378. 有序矩阵中第 K 小的元素
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int index = 0;
        int[] arr = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[index++] = matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
