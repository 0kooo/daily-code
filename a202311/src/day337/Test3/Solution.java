package day337.Test3;

//1486. 数组异或操作
class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
        }
        int res = nums[0];
        for (int i = 1; i < n; i++) {
            res ^= nums[i];
        }
        return res;
    }
}
