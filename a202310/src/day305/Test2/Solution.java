package day305.Test2;

//221. 最大正方形
class Solution {
    public int maximalSquare(char[][] matrix) {
        int maxLen = 0;
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return maxLen;
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] == '1'){
                    maxLen = Math.max(1, maxLen);
                    int currentMaxLen = Math.min(n - i, m - j);
                    for (int k = 1; k < currentMaxLen; ++k){
                        boolean flag = true;
                        if(matrix[i + k][j + k] == 0) break;
                        for (int g = 0; g < k; ++g){
                            if(matrix[i + k][j + g] == '0' || matrix[i + g][j + k] == '0') {
                                flag = false;
                                break;
                            }
                        }
                        if(flag) maxLen = Math.max(maxLen, k + 1);
                        else break;
                    }
                }
            }
        }
        return (maxLen * maxLen);
    }
}
