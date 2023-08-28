package day282.Test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//57. 插入区间
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] newIntervals = new int[intervals.length + 1][2];
        for (int i = 0; i < intervals.length; ++i) {
            newIntervals[i] = intervals[i];
        }
        newIntervals[intervals.length] = newInterval;
        return merge(newIntervals);
    }
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0) return new int[0][2];
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        List<int[]> list = new ArrayList<>();
        for (int[] interval : intervals) {
            int l = interval[0], r = interval[1];
            if(list.size() == 0 || list.get(list.size() - 1)[1] < l){
                list.add(new int[]{l, r});
            }else {
                list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1], r);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
