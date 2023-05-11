package day207.Test1;

//1016. 子串能表示从 1 到 N 数字的二进制串
class Solution {
    public boolean queryString(String s, int n) {
        for (int i = 1; i <= n; i++) {
            String temp = Integer.toBinaryString(i);
            if(!s.contains(temp)){
                return false;
            }
        }
        return true;
    }
}
