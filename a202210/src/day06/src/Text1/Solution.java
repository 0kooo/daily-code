package Text1;

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int sumLen = m * n;
        if(sumLen != r * c){
            return mat;
        }
        int[][] res = new int[r][c];
        for (int i = 0; i < sumLen; i++) {
            res[i / c][i % c] = mat[i / n][i % n];
        }
        return res;
    }
}
