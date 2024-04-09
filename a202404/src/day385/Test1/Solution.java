package day385.Test1;

import java.util.ArrayList;
import java.util.List;

//2942. 查找包含给定字符的单词
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(words[i].contains(x + "")){
                res.add(i);
            }
        }
        return res;
    }
}
