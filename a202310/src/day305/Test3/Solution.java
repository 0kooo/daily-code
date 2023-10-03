package day305.Test3;

//LCR 003. 比特位计数
class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            res[i] = Integer.bitCount(i);
        }
        return res;
    }
}