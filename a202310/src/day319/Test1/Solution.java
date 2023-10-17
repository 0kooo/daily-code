package day319.Test1;

//357. 统计各位数字都不同的数字个数
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0)return 1;
        if(n == 1) return 10;
        int res = 10, cut = 9;
        for (int i = 0; i < n - 1; i++) {
            cut *= 9 - i;
            res += cut;
        }
        return res;
    }
}
