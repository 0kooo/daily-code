package day90.Text1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> ms = new HashMap<>();
        Map<Character, Character> mt = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char x = s.charAt(i);
            char y = t.charAt(i);
            if((ms.containsKey(x) && ms.get(x) != y) || (mt.containsKey(y) && mt.get(y) != x)){
                return false;
            }
            ms.put(x, y);
            mt.put(y, x);
        }
        return true;
    }
}
