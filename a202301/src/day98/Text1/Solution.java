package day98.Text1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public int rearrangeCharacters(String s, String target) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> targetMap = new HashMap<>();
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(targetMap.containsKey(c)){
                sMap.put(c, sMap.getOrDefault(c, 0) + 1);
            }
        }
        int res = Integer.MAX_VALUE;
        Set<Map.Entry<Character, Integer>> entries = targetMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            char key = entry.getKey();
            int value = entry.getValue();
            int count = sMap.containsKey(key) ? sMap.get(key) : 0;
            res = Math.min(res, count / value);
            if(res == 0){
                return 0;
            }
        }
        return res;
    }
}
