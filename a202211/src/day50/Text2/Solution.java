package day50.Text2;

class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = prices.length - 1;
        int total = 0;
        while(l < r + 1){
            while(l < r && prices[l + 1] <= prices[l]){
                l++;
            }
            int min = prices[l];
            while(l < r && prices[l] <= prices[l + 1]){
                l++;
            }
            total += (prices[l++] - min);
        }
        return total;
    }
}
