package day167.Test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//187. 重复的DNA序列
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        for (int i = 0; i <= s.length() - 10;i++) {
            String str = s.substring(i, i + 10);
            map.put(str, map.getOrDefault(str,0) + 1);
            if(map.get(str) == 2){
                res.add(str);
            }
        }
        return res;
    }
}
