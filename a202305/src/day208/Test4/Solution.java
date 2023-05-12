package day208.Test4;

import java.util.Arrays;
import java.util.Comparator;

//435. 无重叠区间
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        if(n == 0) return 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int res = 1, right = intervals[0][1];
        for (int i = 1; i < n; i++) {
            if(intervals[i][0] >= right){
                res++;
                right = intervals[i][1];
            }
        }
        return n - res;
    }
}
