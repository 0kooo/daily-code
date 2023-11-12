package day345.Test2;

import java.util.HashMap;
import java.util.Map;

//781. 森林中的兔子
class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int y : answers) {
            map.put(y, map.getOrDefault(y, 0) + 1);
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int x = entry.getValue(), y = entry.getKey();
            res += (x + y) / (y + 1) * (y + 1);
        }
        return res;
    }
}