package day255.Test2;


//2558. 从数量最多的堆取走礼物
class Solution {
    public long pickGifts(int[] gifts, int k) {
        long res = 0;
        int n = gifts.length;
        while (k != 0){
            double max = Integer.MIN_VALUE;
            int index = 0;
            for (int i = 0; i < n; i++) {
                if(max < gifts[i]){
                    max = gifts[i];
                    index = i;
                }
            }
            gifts[index] = (int)Math.floor(Math.pow(max, 0.5));
            k--;
        }
        for (int gift : gifts) {
            res += gift;
        }
        return res;
    }
}
