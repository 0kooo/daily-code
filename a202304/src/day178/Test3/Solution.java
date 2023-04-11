package day178.Test3;


import java.util.HashMap;
import java.util.Map;

//1624. 两个相同字符之间的最长子字符串
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        /*int res = -1;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                char c1 = s.charAt(i);
                char c2 = s.charAt(j);
                if(c1 == c2){
                    res = Math.max(res, j - i - 1);
                }
            }
        }
        return res;*/

        int res = -1;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                res = Math.max(res, i - map.get(c) - 1);
            }else{
                map.put(c, i);
            }
        }
        return res;
    }
}
