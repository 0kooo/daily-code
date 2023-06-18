package day234.Test3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//1408. 数组中的字符串匹配
class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> set = new HashSet<>();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(words[i].contains(words[j])) set.add(words[j]);
                else if(words[j].contains(words[i])) set.add(words[i]);
            }
        }
        return new ArrayList<>(set);
    }
}
