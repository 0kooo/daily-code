package day363.Test2;

//1689. 十-二进制数的最少数目
class Solution {
    public int minPartitions(String n) {
        int res = 0;
        for (char c : n.toCharArray()) {
            res = Math.max(c - '0', res);
        }
        return res;
    }
}