package day242.Test1;

//2485. 找出中枢整数
class Solution {
    public int pivotInteger(int n) {
        if(n == 1) return 1;
        int res = -1, sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        int temp = 0;
        for (int i = 1; i <= n; i++){
            temp += i;
            if(temp == (sum - temp + i)){
                res = i;
                break;
            }
        }
        return res;
    }
}
