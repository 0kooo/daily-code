package day303.Test1;

//1837. K 进制表示下的各位数字总和
class Solution {
    public int sumBase(int n, int k) {
        int res = 0;
        while (n != 0){
            res += (n % k);
            n /= k;
        }
        res += n;
        return res;
    }
}

