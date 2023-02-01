package day110.Text1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map  = new HashMap<>();
        int index = 97;
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if(c != ' ' && !map.containsKey(c)){
                map.put(c, (char)(index++));
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if(c != ' '){
                char trueC = map.get(c);
                res.append(trueC);
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
