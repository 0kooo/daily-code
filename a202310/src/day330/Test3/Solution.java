package day330.Test3;

import java.util.ArrayList;
import java.util.List;

//1078. Bigram 分词
class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] s = text.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length - 2; i++) {
            if(s[i].equals(first) && s[i + 1].equals(second)){
                list.add(s[i + 2]);
            }
        }
        int size = list.size();
        String[] res = new String[size];
        for (int i = 0; i < size; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
