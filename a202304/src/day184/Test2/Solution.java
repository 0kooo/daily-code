package day184.Test2;


//172. 阶乘后的零
class Solution {
    public int trailingZeroes(int n) {
        int res = 0;
        while (n != 0){
            n /= 5;
            res += 5;
        }
        return res;
    }
}