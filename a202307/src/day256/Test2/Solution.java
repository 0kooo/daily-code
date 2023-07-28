package day256.Test2;

import java.util.ArrayList;
import java.util.List;

//2586. 统计范围内的元音字符串数
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int res = 0;
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        for (int i = left; i <= right; i++){
            char f = words[i].charAt(0);
            char e = words[i].charAt(words[i].length() - 1);
            if(list.contains(f) && list.contains(e)) res++;
        }
        return res;
    }
}
