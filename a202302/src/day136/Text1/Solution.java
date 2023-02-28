package day136.Text1;

import java.util.*;

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] v : items1) {
            map.put(v[0], map.getOrDefault(v, 0) + v[1]);
        }
        for (int[] v : items2) {
            map.put(v[0], map.getOrDefault(v, 0) + v[1]);
        }
        List<List<Integer>> res = new ArrayList<>();
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            List<Integer> temp = new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            res.add(temp);
        }
        res.sort((a, b) -> a.get(0) - b.get(0));
        return res;
    }
}
