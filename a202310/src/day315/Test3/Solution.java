package day315.Test3;

//372. 超级次方
class Solution {
    static final int MOD = 1337;
    public int superPow(int a, int[] b) {
        int res = 1;
        for (int e : b) {
            res = (int)((long) pow(res, 10) * pow(a, e) % MOD);
        }
        return res;
    }

    private int pow(int x, int n) {
        int res = 1;
        while (n != 0){
            if(n % 2 != 0) res = (int)((long)res * x % MOD);
            x = (int)((long)x * x % MOD);
            n /= 2;
        }
        return res;
    }
}
