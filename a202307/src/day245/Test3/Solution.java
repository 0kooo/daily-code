package day245.Test3;

//2317. 操作后的最大异或和
class Solution {
    public int maximumXOR(int[] nums) {
        var res = 0;
        for (var num : nums) {
            res |= num;
        }
        return res;
    }
}
