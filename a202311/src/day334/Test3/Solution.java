package day334.Test3;

//1967. 作为子字符串出现在单词中的字符串数目
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int res = 0;
        for (int i = 0; i < patterns.length; i++) {
            if(word.contains(patterns[i])) res++;
        }
        return res;
    }
}