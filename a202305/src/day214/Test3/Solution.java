package day214.Test3;

//1662. 检查两个字符串数组是否相等
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        for (String s : word1) {
            s1 += s;
        }
        for (String s : word2) {
            s2 += s;
        }
        return s1.equals(s2);
    }
}