package day335.Test3;

//1374. 生成每种字符都是奇数个的字符串
class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if(n % 2 == 1) return sb.append("a".repeat(n)).toString();
        else return sb.append("a".repeat(n - 1)).append("b").toString();
    }
}
