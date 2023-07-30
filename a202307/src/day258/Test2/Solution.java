package day258.Test2;

//2643. 一最多的行
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] res = new int[2];
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            int num = 0;
            for (int j = 0; j < m; j++) {
                if(mat[i][j] == 1){
                    num++;
                }
            }
            if(res[1] < num){
                res[1] = num;
                res[0] = i;
            }else if(res[1] == num){
                res[0] = Math.min(res[0], i);
            }
        }
        return res;
    }
}
