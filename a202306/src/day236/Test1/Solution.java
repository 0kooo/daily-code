package day236.Test1;

//2529. 正整数和负整数的最大计数
class Solution {
    public int maximumCount(int[] nums) {
        int max1 = 0, max2 = 0;
        for (int num : nums) {
            if(num > 0) max1++;
            else if(num < 0) max2++;
        }
        return Math.max(max1, max2);
    }
}
