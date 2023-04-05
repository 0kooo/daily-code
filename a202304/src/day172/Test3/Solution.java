package day172.Test3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//1207. 独一无二的出现次数
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int key : map.keySet()) {
            if(!set.add(map.get(key))){
                return false;
            }
        }
        return true;
    }
}
