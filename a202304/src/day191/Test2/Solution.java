package day191.Test2;

//2133. 检查是否每一行每一列都包含全部整数
class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for (int[] ints : matrix) {
            int[] arr = new int[n + 1];
            for (int i : ints) {
                arr[i]++;
            }
            for (int k = 1; k < n + 1; k++) {
                if(arr[k] != 1) return false;
            }
        }
        for(int i = 0; i < n; i++){
            int[] arr = new int[n + 1];
            for(int j = 0; j < n; j++){
                arr[matrix[j][i]]++;
            }
            for (int k = 1; k < n + 1; k++) {
                if(arr[k] != 1) return false;
            }
        }
        return true;
    }
}
