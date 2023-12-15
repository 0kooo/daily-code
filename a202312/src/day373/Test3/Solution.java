package day373.Test3;

//2864. 最大二进制奇数
class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if(c == '1') count++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < count; i++) {
            sb.append(1);
        }
        for (int i = 0; i < s.length() - count; i++) {
            sb.append(0);
        }
        return sb.append(1).toString();
    }
}