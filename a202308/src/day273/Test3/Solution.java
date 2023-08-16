package day273.Test3;

//714. 买卖股票的最佳时机含手续费
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int buy = prices[0] + fee;
        int res = 0;
        for (int i = 1; i < n; i++) {
            if(prices[i] + fee < buy){
                buy = prices[i] + fee;
            }else if(prices[i] > buy){
                res += prices[i] - buy;
                buy = prices[i];
            }
        }
        return res;
    }
}
