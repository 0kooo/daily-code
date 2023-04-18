package day185.Test2;

import java.util.HashMap;
import java.util.Map;

//1941. 检查是否所有字符出现次数相同
class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char key : map.keySet()) {
            if(map.get(key) != n / map.size()){
                return false;
            }
        }
        return true;
    }
}
