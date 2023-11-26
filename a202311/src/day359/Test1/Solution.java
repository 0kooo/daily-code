package day359.Test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//828. 统计子串中的唯一字符
class Solution {
    public int uniqueLetterString(String s) {
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c, new ArrayList<>());
                map.get(c).add(-1);
            }
            map.get(c).add(i);
        }
        int res = 0;
        for (Map.Entry<Character, List<Integer>> entry : map.entrySet()) {
            List<Integer> arr = entry.getValue();
            arr.add(s.length());
            for (int i = 1; i < arr.size() - 1; i++){
                res += (arr.get(i) - arr.get(i - 1)) * (arr.get(i + 1) - arr.get(i));
            }
        }
        return res;
    }
}