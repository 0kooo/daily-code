package day154.Test2;

//1137. 第 N 个泰波那契数
class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n <= 2) return 1;
        int p = 0, q = 0, t = 1, s = 1;
        for (int i = 3; i <= n; i++) {
            p = q;
            q = t;
            t = s;
            s = p + q + t;
        }
        return s;
    }
}
