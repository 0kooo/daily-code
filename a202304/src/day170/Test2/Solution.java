package day170.Test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1002. 查找共用字符
class Solution {
    public List<String> commonChars(String[] words) {
        int[] count = new int[26];
        Arrays.fill(count, Integer.MAX_VALUE);
        for (String word : words) {
            int[] sum = new int[26];
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                sum[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                count[i] = Math.min(count[i], sum[i]);
            }
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < count[i]; j++) {
                res.add("" + (char)(i + 'a'));
            }
        }
        return res;
    }
}
