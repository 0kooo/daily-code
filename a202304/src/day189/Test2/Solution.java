package day189.Test2;

import java.util.HashMap;
import java.util.Map;

//2085. 统计出现过一次的公共字符串
class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();
        int res = 0;
        for (String s : words1) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : words2) {
            if(map.containsKey(s)){
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        for (String s : words2) {
            if(map.containsKey(s) && map.get(s) == 2){
                res++;
            }
        }
        return res;
    }
}
