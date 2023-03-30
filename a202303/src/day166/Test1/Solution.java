package day166.Test1;

import java.util.Arrays;

//1637. 两点之间不包含任何点的最宽垂直区域
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int res = 0;
        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < points.length - 1; i++) {
            res = Math.max(res, points[i + 1][0] - points[i][0]);
        }
        return res;
    }
}
