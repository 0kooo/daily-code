package day64.Text3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        boolean[] word = new boolean[s.length() + 1];
        word[0]  = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if(word[j] && set.contains(s.substring(j, i))){
                    word[i] = true;
                    break;
                }
            }
        }
        return word[s.length()];
    }
}
