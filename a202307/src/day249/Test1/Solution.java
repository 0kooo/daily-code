package day249.Test1;


//2544. 交替数字和
class Solution {
    public int alternateDigitSum(int n) {
        int res = 0, sign = 1;
        while (n > 0){
            res += n % 10 * sign;
            sign = -sign;
            n /= 10;
        }
        return res;
    }
}
