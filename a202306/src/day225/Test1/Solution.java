package day225.Test1;

import java.util.HashMap;
import java.util.Map;

//1156. 单字符重复子串的最大长度
class Solution {
    public int maxRepOpt1(String text) {
        int n = text.length();
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < n;) {
            int j = i;
            while (j < n && text.charAt(i) == text.charAt(j)){
                j++;
            }
            int count = j - i;
            if(count < map.getOrDefault(text.charAt(i), 0) && ( j < n || i > 0)){
                res = Math.max(count + 1, res);
            }
            int k = j + 1;
            while (k < n && text.charAt(i) == text.charAt(k)){
                k++;
            }
            res = Math.max(res, Math.min(k - i, map.getOrDefault(text.charAt(i), 0)));
            i = j;
        }
        return res;
    }
}
