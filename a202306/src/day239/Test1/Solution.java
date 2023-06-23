package day239.Test1;

//1734. 解码异或后的排列
class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length;
        int[] res = new int[n + 1];
        int total = 0, odd = 0;
        for (int i = 1; i <= n + 1; i++) {
            total ^= i;
        }
        for (int i = 1; i < n; i += 2) {
            odd ^= encoded[i];
        }
        res[0] = total ^ odd;
        for (int i = 0; i < n; i++) {
            res[i + 1] = res[i] ^ encoded[i];
        }
        return res;
    }
}
