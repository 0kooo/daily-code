package Text1;

class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int[][] newArr = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                newArr[j][len - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < len * len; i++) {
            matrix[i / len][i % len] =  newArr[i / len][i % len];
        }
    }
}
