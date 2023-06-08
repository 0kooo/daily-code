package day229.Test3;


//2239. 找到最接近 0 的数字
class Solution {
    public int findClosestNumber(int[] nums) {
        int res = nums[0];
        for (int num : nums) {
            if(Math.abs(num) == Math.abs(res)){
                res = Math.max(num, res);
            }else if(Math.abs(num) < Math.abs(res)){
                res = num;
            }
        }
        return res;
    }
}
