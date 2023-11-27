package day360.Test3;

//2716. 最小化字符串长度
class Solution {
    public int minimizedStringLength(String s) {
        int mask = 0;
        for (char c : s.toCharArray()) {
            mask |= 1 << (c - 'a');
        }
        return Integer.bitCount(mask);
    }
}