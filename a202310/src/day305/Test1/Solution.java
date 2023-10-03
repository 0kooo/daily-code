package day305.Test1;

//123. 买卖股票的最佳时机 III
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int price1 = -prices[0], sell1 = 0;
        int price2 = -prices[0], sell2 = 0;
        for(int i = 1; i < n; ++i){
            price1 = Math.max(price1, -prices[i]);
            sell1 = Math.max(sell1, price1 + prices[i]);
            price2 = Math.max(price2, sell1 - prices[i]);
            sell2 = Math.max(sell2, price2 + prices[i]);
        }
        return sell2;
    }
}
