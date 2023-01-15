package day99.Text1;

class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        int high = 0;
        for (int i = 1; i <= n; i++) {
            if((i & (i - 1)) == 0){
                high  = i;
            }
            bits[i] = bits[i - high] + 1;
        }
        return bits;
    }
}
