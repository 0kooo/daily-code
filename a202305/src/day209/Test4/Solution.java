package day209.Test4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//890. 查找和替换模式
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if(match(word, pattern) && match(pattern, word)){
                res.add(word);
            }
        }
        return res;
    }

    private boolean match(String word, String pattern) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c1 = word.charAt(i);
            char c2 = pattern.charAt(i);
            if(!map.containsKey(c1)){
                map.put(c1, c2);
            }else if(map.get(c1) != c2){
                return false;
            }
        }
        return true;
    }
}
