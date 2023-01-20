package day105.Text1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] res = new int[k];
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] log : logs) {
            int id = log[0];
            int time = log[1];
            map.putIfAbsent(id, new HashSet<>());
            map.get(id).add(time);
        }
        for (Set<Integer> value : map.values()) {
            int count = value.size();
            res[count - 1]++;
        }
        return res;
    }
}
