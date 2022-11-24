package Text2;

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        int sum = m * n;
        for (int i = 0; i < sum; i++) {
            if(matrix[i / n][i % n] == 0){
                row[i / n] = col[i % n] = true;
            }
        }
        for (int i = 0; i < sum; i++) {
            if(row[i / n] || col[i % n]){
                matrix[i / n][i % n] = 0;
            }
        }
    }
}
