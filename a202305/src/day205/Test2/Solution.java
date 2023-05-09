package day205.Test2;

//198. 打家劫舍
class Solution {
    public int rob(int[] nums) {
        int prev = 0;
        int curr = 0;
        for (int num : nums) {
            int temp = Math.max(curr, prev + num);
            prev = curr;
            curr = temp;
        }
        return curr;
    }
}
