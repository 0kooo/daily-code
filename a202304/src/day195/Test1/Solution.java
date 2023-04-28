package day195.Test1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//2423. 删除字符使频率相同(不是自己写的，我会写但没写完，被通过率吓到了（简单题 19.2%）
class Solution {
    public boolean equalFrequency(String word) {
        Map<Character, Integer> map = new HashMap<>();
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            tm.put(e.getValue(), tm.getOrDefault(e.getValue(), 0) + 1);
        }
        if(tm.size() > 2){
            return false;
        }
        if(tm.size() == 1){
            return tm.containsKey(1) || map.size() == 1;
        }
        return tm.containsKey(1) && tm.get(1) == 1 ||
                tm.lastEntry().getValue() == 1 && tm.lastKey() - tm.firstKey() == 1;
    }
}
