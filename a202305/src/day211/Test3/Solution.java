package day211.Test3;


//1991. 找到数组的中间位置
class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            leftSum += nums[i];
            if(leftSum == sum){
                return i;
            }
            sum -= nums[i];
        }
        return -1;
    }
}
