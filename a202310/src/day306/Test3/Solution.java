package day306.Test3;

import java.util.*;

//451. 根据字符出现频率排序
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            char c = list.get(i);
            int key = map.get(c);
            for (int j = 0; j < key; ++j){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
