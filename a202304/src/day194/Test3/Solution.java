package day194.Test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//2273. 移除字母异位词后的结果数组
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        String pre = "";
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            Arrays.sort(chars);
            String s = String.valueOf(chars);
            if(i >= 1 && s.equals(pre)) continue;
            res.add(words[i]);
            pre = s;
        }
        return res;
    }
}
