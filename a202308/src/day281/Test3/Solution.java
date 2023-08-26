package day281.Test3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//151. 反转字符串中的单词
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        List<String> word = Arrays.asList(s.split("\\s+"));
        Collections.reverse(word);
        return String.join(" ", word);
    }
}
