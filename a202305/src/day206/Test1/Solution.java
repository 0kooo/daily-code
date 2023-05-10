package day206.Test1;

//1015. 可被 K 整除的最小整数
class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k % 2 == 0 || k % 5 == 0) return -1;
        int len = 1, resid = 1 % k;
        while (resid != 0){
            resid = (resid * 10 + 1) % k;
            len++;
        }
        return len;
    }
}
