package day247.Test1;

//1828. 统计一个圆中点的数目
class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int m = points.length, n = queries.length;
        int[] res = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int x = points[i][0] - queries[j][0];
                int y = points[i][1] - queries[j][1];
                if(Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(queries[j][2], 2)){
                    res[j]++;
                }
            }
        }
        return res;
    }
}
