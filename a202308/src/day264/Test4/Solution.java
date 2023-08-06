package day264.Test4;

//654. 最大二叉树
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int left, int right) {
        if(left > right) return null;
        int index = left;
        for (int i = left + 1; i <= right; i++){
            if(nums[index] < nums[i]) index = i;
        }
        TreeNode res = new TreeNode(nums[index]);
        res.left = dfs(nums, left, index - 1);
        res.right = dfs(nums, index + 1, right);
        return res;
    }
}
