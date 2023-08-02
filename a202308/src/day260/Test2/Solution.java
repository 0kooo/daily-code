package day260.Test2;

//1652. 拆炸弹
class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        if(k == 0) return res;
        int[] sum = new int[n * 2 + 10];
        for (int i = 1; i <= 2 * n; i++) sum[i] += sum[i - 1] + code[(i - 1) % n];
        for (int i = 1; i <= n; i++){
            if(k < 0) res[i - 1] = sum[i + n - 1] - sum[i + n + k - 1];
            else res[i - 1] = sum[i + k] - sum[i];
        }
        return res;
    }
}
