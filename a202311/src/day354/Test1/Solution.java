package day354.Test1;

//2216. 美化数组的最少删除数
class Solution {
    public int minDeletion(int[] nums) {
        int n = nums.length;
        int res = 0;
        boolean flag = true;
        for (int i = 0; i < n - 1; ++i){
            if(nums[i] == nums[i + 1] && flag) res++;
            else flag = !flag;
        }
        if((n - res) % 2 != 0) res++;
        return res;
    }
}