package day247.Test2;

//1863. 找出所有子集的异或总和再求和
class Solution {
    int res = 0;
    public int subsetXORSum(int[] nums) {
        if(nums.length == 1) return nums[0];
        dfs(nums, 0, 0);
        return res;
    }

    private void dfs(int[] nums, int i, int sum) {
        if(i == nums.length){
            res += sum;
            return;
        }
        dfs(nums, i + 1, sum ^ nums[i]);
        dfs(nums, i + 1, sum);
    }
}
