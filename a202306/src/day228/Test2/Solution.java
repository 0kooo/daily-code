package day228.Test2;

//2255. 统计是给定字符串前缀的字符串数目
class Solution {
    public int countPrefixes(String[] words, String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            String substring = s.substring(0, i + 1);
            for (String word : words) {
                if(word.equals(substring)) res++;
            }
        }
        return res;
    }
}
