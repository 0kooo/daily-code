package Text2;

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minp = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if(minp > prices[i]){
                minp = prices[i];
            }
            if(max < (prices[i] - minp)){
                max = (prices[i] - minp);
            }
        }
        return max;
    }
}
