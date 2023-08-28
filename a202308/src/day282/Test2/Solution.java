package day282.Test2;

import java.util.List;

//2828. 判别首字母缩略词
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word.charAt(0));
        }
        return sb.toString().equals(s);
    }
}
