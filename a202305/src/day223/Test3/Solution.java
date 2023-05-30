package day223.Test3;

//2114. 句子中的最多单词数
class Solution {
    public int mostWordsFound(String[] sentences) {
        int res = Integer.MIN_VALUE;
        for (String sentence : sentences) {
            String[] s = sentence.split(" ");
            res = Math.max(s.length, res);
        }
        return res;
    }
}
