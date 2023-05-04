package day200.Test2;

//1475. 商品折扣后的最终价格
class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = i + 1; j < n; j++) {
                if(prices[j] <= prices[i]){
                    res[i] = prices[i] - prices[j];
                    flag = false;
                    break;
                }
            }
            if(flag) res[i] = prices[i];
        }
        return res;
    }
}
