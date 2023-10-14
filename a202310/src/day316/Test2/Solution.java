package day316.Test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//1738. 找出第 K 大的异或坐标值
class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
        int n = matrix.length, m = matrix[0].length;
        int[][] per = new int[n + 1][m + 1];
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                per[i][j] = per[i - 1][j] ^ per[i][j - 1] ^ per[i - 1][j - 1] ^ matrix[i - 1][j - 1];
                list.add(per[i][j]);
            }
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        return list.get(k - 1);
    }
}
