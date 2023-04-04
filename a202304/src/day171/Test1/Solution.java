package day171.Test1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//648. 单词替换
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> set = new HashSet<>(dictionary);

        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if(set.contains(words[i].substring(0, j))){
                    words[i] = words[i].substring(0, j);
                    break;
                }
            }
        }
        return String.join(" ", words);
    }
}
