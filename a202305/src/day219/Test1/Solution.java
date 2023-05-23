package day219.Test1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//1090. 受标签影响的最大值
class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        int n =values.length;
        Integer[] id = new Integer[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
        Arrays.sort(id, (a, b) -> values[b] - values[a]);
        int res = 0, choose = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n && choose < numWanted; i++) {
            int label = labels[id[i]];
            if(map.getOrDefault(label, 0) == useLimit){
                continue;
            }
            ++choose;
            res += values[id[i]];
            map.put(label, map.getOrDefault(label, 0) + 1);
        }
        return res;
    }
}