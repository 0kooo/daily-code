package day80.Text1;

class Solution {
    public int minimumBoxes(int n) {
        int x = (int)Math.cbrt(6L * n);
        int ans = x * (x + 1) / 2;
        int maxJ = (int)((long) x * (x + 1) * (x + 2) / 6);
        if(maxJ > n){
            maxJ -= ans;
            ans -= x;
        }
        return ans + (int) Math.ceil((-1 + Math.sqrt(1 + 8 * (n - maxJ))) / 2);
    }
}
