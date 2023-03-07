package day143.Test2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set = new HashSet<>();
        for (String word : banned) {
            set.add(word);
        }
        int max = 0;
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int length = paragraph.length();
        for (int i = 0; i <= length; i++) {
            if(i < length && Character.isLetter(paragraph.charAt(i))){
                sb.append(Character.toLowerCase(paragraph.charAt(i)));
            }else if(sb.length() > 0){
                String word = sb.toString();
                if(!set.contains(word)){
                    int m = map.getOrDefault(word, 0) + 1;
                    map.put(word, m);
                    max = Math.max(max, m);
                }
                sb.setLength(0);
            }
        }
        String mostCommon = "";
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String word = entry.getKey();
            Integer count = entry.getValue();
            if(count == max){
                mostCommon = word;
                break;
            }
        }
        return mostCommon;
    }
}
