package day357.Test3;

//2481. 分割圆的最少切割次数
class Solution {
    public int numberOfCuts(int n) {
        if(n == 1) return 0;
        if(n % 2 == 0) return n / 2;
        return n;
    }
}