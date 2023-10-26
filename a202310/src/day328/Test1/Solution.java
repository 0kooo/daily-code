package day328.Test1;

//2044. 统计按位或能得到最大值的子集数目
class Solution {
    int[] nums;
    int res, max;
    public int countMaxOrSubsets(int[] nums) {
        this.max = 0;
        this.res = 0;
        this.nums = nums;
        dfs(0,0);
        return res;
    }

    private void dfs(int por, int val) {
        if(por == nums.length){
            if(max < val){
                max = val;
                res = 1;
            }else if(val == max){
                res++;
            }
            return;
        }
        dfs(por + 1, val | nums[por]);
        dfs(por + 1, val);
    }
}
