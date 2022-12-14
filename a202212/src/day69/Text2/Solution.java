package day69.Text2;

import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] newS1 = s1.split(" ");
        String[] newS2 = s2.split(" ");
        HashMap<String, Integer> hm = new HashMap<>();
        for (String s : newS1) {
            hm.put(s,hm.getOrDefault(s, 0) + 1);
        }
        for (String s : newS2) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }

        List<String> res = new ArrayList<>();
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue() == 1){
                res.add(entry.getKey());
            }
        }
        return res.toArray(new String[0]);
    }
}
