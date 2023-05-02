package day197.Test3;

import java.util.Arrays;

//2506. 统计相似字符串对的数目
class Solution {
    public int similarPairs(String[] words) {
        int n = words.length;
        boolean[][] word = new boolean[n][26];
        for (int i = 0; i < n; i++) {
            for (char c : words[i].toCharArray()) {
                if(word[i][c - 'a']) continue;
                word[i][c - 'a'] = true;
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(Arrays.equals(word[i], word[j])){
                    res++;
                }
            }
        }
        return res;
    }
}
