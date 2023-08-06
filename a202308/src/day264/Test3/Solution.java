package day264.Test3;

import java.util.Collections;
import java.util.HashSet;

//2744. 最大字符串配对数目
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int res = 0;
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set, words);
        for (String word : words) {
            String temp = new StringBuffer(word).reverse().toString();
            if(word.equals(temp)) continue;
            if(set.contains(temp)){
                res++;
                set.remove(word);
                set.remove(temp);
            }
        }
        return res;
    }
}
