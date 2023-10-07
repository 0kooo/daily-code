package day309.Test2;

//330. 按要求补齐数组
class Solution {
    public int minPatches(int[] nums, int n) {
        int res = 0, len = nums.length, index = 0;
        long x = 1;
        while (x <= n){
            if(index < len && nums[index] <= x){
                x += nums[index++];
            }else{
                x *= 2;
                res++;
            }
        }
        return res;
    }
}
