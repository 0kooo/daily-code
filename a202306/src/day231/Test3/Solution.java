package day231.Test3;

//1304. 和为零的 N 个不同整数
class Solution {
    public int[] sumZero(int n) {
        if(n == 1) return new int[]{0};
        int[] res = new int[n];
        int num = 1;
        if(n % 2 == 1) n -= 1;
        for (int i = 0; i < n; i += 2) {
            res[i] = num;
            res[i + 1] = -num;
            num++;
        }
        return res;
    }
}
