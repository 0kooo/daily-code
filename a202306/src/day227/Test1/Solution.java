package day227.Test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//2352. 相等行列对
class Solution {
    public int equalPairs(int[][] grid) {
        int res = 0;
        int n = grid.length;
        Map<List<Integer>, Integer> map1 = new HashMap<>();
        Map<List<Integer>, Integer> map2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            List<Integer> s1 = new ArrayList<>();
            List<Integer> s2 = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                s1.add(grid[i][j]);
                s2.add(grid[j][i]);
            }
            map1.put(s1, map1.getOrDefault(s1, 0) + 1);
            map2.put(s2, map2.getOrDefault(s2, 0) + 1);
        }
        for (List<Integer> key : map1.keySet()) {
            if(map2.containsKey(key)){
                res += (map1.get(key) * map2.get(key));
                System.out.println(res);
            }
        }
        return res;
    }
}
