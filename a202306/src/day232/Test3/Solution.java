package day232.Test3;

//1255. 得分最高的单词集合
class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int n = words.length, res = 0;
        int[] count = new int[26];
        for (char letter : letters) {
            count[letter - 'a']++;
        }
        for (int s = 1; s < (1 << n); s++){
            int[] wordCount = new int[26];
            for (int k = 0; k < n; k++) {
                if((s & (1 << k)) == 0) continue;
                for (int i = 0; i < words[k].length(); i++) {
                    char c = words[k].charAt(i);
                    wordCount[c - 'a']++;
                }
            }
            boolean flag = true;
            int sum = 0;
            for (int i = 0; i < 26; i++) {
                sum += score[i] * wordCount[i];
                flag = flag && (wordCount[i] <= count[i]);
            }
            if(flag) res = Math.max(sum, res);
        }
        return res;
    }
}
