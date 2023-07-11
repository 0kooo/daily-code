package day248.Test3;

//1961. 检查字符串是否为数组前缀
class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String temp = "";
        for (String word : words) {
            temp += word;
            if(s.equals(temp)) return true;
        }
        return false;
    }
}