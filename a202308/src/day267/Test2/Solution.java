package day267.Test2;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//2788. 按分隔符拆分字符串
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        String rule = Character.toString(separator);
        StringTokenizer tokenizer = new StringTokenizer(String.join(rule, words), rule);
        while (tokenizer.hasMoreElements()) res.add(tokenizer.nextToken());
        return res;
    }
}
