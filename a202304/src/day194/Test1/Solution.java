package day194.Test1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//1048. 最长字符串链
class Solution {
    public int longestStrChain(String[] words) {
        int res = 0;
        Map<String, Integer> map = new HashMap<>();
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        for (String word : words) {
            map.put(word, 1);
            for (int i = 0; i < word.length(); i++) {
                String prv = word.substring(0, i) + word.substring(i + 1);
                if(map.containsKey(prv)){
                    map.put(word, Math.max(map.get(prv) + 1, map.get(word)));
                }
            }
            res = Math.max(res, map.get(word));
        }
        return res;
    }
}
