package Text2;

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int len = nums.length;
        int count = 0;
        int temp = 1;
        int j = 0;
        for (int i = 0; i < len; i++) {
            temp *= nums[i];
            while(j <= i && temp >= k){
                temp /= nums[j];
                j++;
            }
            count += i - j + 1;
        }
        return count;
    }
}
