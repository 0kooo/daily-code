package day211.Test1;

import java.util.HashMap;
import java.util.Map;

//1072. 按列翻转得到最大值等行数
class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> map = new HashMap<>();
        int n = matrix.length, m = matrix[0].length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            char[] arr = new char[m];
            for (int j = 0; j < m; j++) {
                arr[j] = (char) ('0' + matrix[i][j] ^ matrix[i][0]);
            }
            String s = new String(arr);
            map.put(s, map.getOrDefault(s, 0) + 1);
            res = Math.max(res, map.get(s));
        }
        return res;
    }
}
