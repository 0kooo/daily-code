package day261.Test2;

//2660. 保龄球游戏的获胜者
class Solution {
    public int isWinner(int[] a, int[] b) {
        int sum1 = 0, sum2 = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if((i - 1 >= 0 && a[i - 1] == 10) || ((i - 2) >= 0 && a[i - 2] == 10)) sum1 += (a[i] * 2);
            else sum1 += a[i];
        }
        for (int i = 0; i < n; i++) {
            if((i - 1 >= 0 && b[i - 1] == 10) || ((i - 2) >= 0 && b[i - 2] == 10)) sum2 += (b[i] * 2);
            else sum2 += b[i];
        }
        if(sum1 == sum2) return 0;
        return sum1 > sum2 ? 1 : 2;
    }
}