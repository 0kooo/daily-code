package day351.Test1;


//2342. 数位和相等数对的最大和
class Solution {
    public int maximumSum(int[] nums) {
        int res = -1;
        int[] m = new int[82];
        for (int num : nums) {
            int sum = 0;
            for (int x = num; x > 0; x /= 10) sum += (x % 10);
            if(m[sum] > 0) res = Math.max(res, m[sum] + num);
            m[sum] = Math.max(m[sum], num);
        }
        return res;
    }
}