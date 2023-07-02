package day245.Test2;

import java.util.HashMap;
import java.util.Map;

//1725. 可以形成最大正方形的矩形数目
class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] r : rectangles) {
            int key = Math.min(r[0], r[1]);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int maxLen = Integer.MIN_VALUE;
        for (int key : map.keySet()) {
             maxLen = Math.max(key, maxLen);
        }
        return map.get(maxLen);
    }
}
