package day208.Test1;

//413. 等差数列划分
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
        int d = nums[0] - nums[1];
        int count = 0, res = 0;
        for(int i = 2; i < n; i++){
            if(nums[i -1 ] - nums[i] == d){
                count++;
            }else{
                d = nums[i - 1] - nums[i];
                count = 0;
            }
            res += count;
        }
        return res;
    }
}
