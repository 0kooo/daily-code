package day336.Test3;

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            if(s[i].contains(searchWord) && s[i].indexOf(searchWord) == 0) return i;
        }
        return -1;
    }
}