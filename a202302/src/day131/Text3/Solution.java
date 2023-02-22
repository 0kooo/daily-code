package day131.Text3;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        String rowIdx = "12210111011122000010020202";
        for (String word : words) {
            boolean flag = true;
            char idx = rowIdx.charAt(Character.toLowerCase(word.charAt(0)) - 'a');
            for (int i = 0; i < word.length(); i++) {
                if(rowIdx.charAt(Character.toLowerCase(word.charAt(i)) - 'a') != idx){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(word);
            }
        }
        String[] res = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
