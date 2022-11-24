package Text1;

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int len = mat.length;
        for(int i = 0; i < len; ++i){
            sum += mat[i][i];
        }
        int temp = len - 1;
        for(int i = 0; i < len; ++i){
            sum += mat[i][temp];
            temp -= 1;
        }
        if(len % 2 != 0){
            sum -= mat[len- ((len + 1) / 2)][len - ((len + 1) / 2)];
        }
        return sum;
    }
}
