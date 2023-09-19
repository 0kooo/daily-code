package day295.Test2;

//521. 最长特殊序列 Ⅰ
class Solution {
    public int findLUSlength(String a, String b) {
        return !a.equals(b) ? Math.max(a.length(), b.length()) : -1;
    }
}
