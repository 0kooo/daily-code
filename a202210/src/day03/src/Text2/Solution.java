package Text2;

class Solution {
    public int maxSubArray(int[] nums) {
        int l = nums.length;
        int m = 0;
        int result = nums[0];
        for (int num : nums) {
            m = Math.max(m + num, num);
            result = Math.max(result, m);
        }
        return result;
    }
}
