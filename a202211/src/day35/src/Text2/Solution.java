package Text2;

import java.util.Arrays;

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int len = mat.length;
        boolean[] flag = new boolean[4];
        Arrays.fill(flag, true);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (mat[i][j] != target[i][j]) {
                    flag[0] = false;
                }
                if (mat[len - j - 1][i] != target[i][j]) {
                    flag[1] = false;
                }
                if (mat[len - i - 1][len - j - 1] != target[i][j]) {
                    flag[2] = false;
                }
                if (mat[j][len - i - 1] != target[i][j]) {
                    flag[3] = false;
                }
            }
        }
        for (boolean b : flag) {
            if (b) {
                return true;
            }
        }
        return false;
    }
}
