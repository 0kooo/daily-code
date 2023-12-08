package day370.Test3;

//2873. 有序三元组中的最大值 I
class Solution {
    public long maximumTripletValue(int[] nums) {
        long res = 0;
        int diff = 0, pre = 0;
        for (int num : nums) {
            res = Math.max(res, (long)diff * num);
            diff = Math.max(diff, pre - num);
            pre = Math.max(pre, num);
        }
        return res;
    }
}
