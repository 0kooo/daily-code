package day141.Test1;

class Solution {
    public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        int res = -1;
        int max = 0, t = 0;
        int wait = 0, i = 0;
        while(wait > 0 || i < customers.length){
            wait += i < customers.length ? customers[i] : 0;
            int up = Math.min(4, wait);
            wait -= up;
            ++i;
            t += up * boardingCost - runningCost;
            if(t > max){
                max = t;
                res = i;
            }
        }
        return res;
    }
}
