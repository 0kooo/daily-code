package Text2;

public class text {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        Solution s = new Solution();
        int max = s.maxProfit(prices);
        System.out.println(max);
    }
}
