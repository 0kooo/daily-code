package day368.Test3;

import java.util.Arrays;

//2839. 判断通过操作能否让字符串相等 I
class Solution {
    public boolean canBeEqual(String s1, String s2) {
        var cnt1 = new int[2][26];
        var cnt2 = new int[2][26];
        for (int i = 0; i < s1.length(); i++) {
            cnt1[i % 2][s1.charAt(i) - 'a']++;
            cnt2[i % 2][s2.charAt(i) - 'a']++;
        }
        return Arrays.deepEquals(cnt1, cnt2);
    }
}
