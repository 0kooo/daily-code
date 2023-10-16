package day318.Test1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//539. 最小时间差
class Solution {
    public int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);
        int res = Integer.MAX_VALUE;
        int t0min = getMin(timePoints.get(0));
        int perMin = t0min;
        for (int i = 1; i < timePoints.size(); i++) {
            int min = getMin(timePoints.get(i));
            res = Math.min(res, min - perMin);
            perMin = min;
        }
        res = Math.min(res, t0min + 1440 - perMin);
        return res;
    }

    private int getMin(String t) {
        return ((t.charAt(0) - '0') * 10 + (t.charAt(1) - '0')) * 60 + (t.charAt(3) - '0') * 10 + (t.charAt(4) - '0');
    }
}
