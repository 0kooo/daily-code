package day315.Test1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

//1488. 避免洪水泛滥
class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] res = new int[n];
        Arrays.fill(res, 1);
        TreeSet<Integer> ts = new TreeSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(rains[i] == 0) ts.add(i);
            else{
                res[i] = -1;
                if(map.containsKey(rains[i])){
                    Integer it = ts.ceiling(map.get(rains[i]));
                    if(it == null) return new int[0];
                    res[it] = rains[i];
                    ts.remove(it);
                }
                map.put(rains[i], i);
            }
        }
        return res;
    }
}
