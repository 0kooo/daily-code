package day365.Test3;

//2810. 故障键盘
class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(c == 'i') sb.reverse();
            else sb.append(c);
        }
        return sb.toString();
    }
}