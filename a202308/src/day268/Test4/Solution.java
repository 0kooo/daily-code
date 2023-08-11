package day268.Test4;

import java.util.Arrays;

//452. 用最少数量的箭引爆气球
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (o1, o2) -> o1[1] < o2[1] ? -1 : 1);
        int res = 1, per = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if(points[i][0] > per){
                res++;
                per = points[i][1];
            }
        }
        return res;
    }
}
