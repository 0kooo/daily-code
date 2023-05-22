package day218.Test1;

//1080. 根到叶路径上的不足节点
class Solution {
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        boolean res = dfs(root, 0, limit);
        return res ? root : null;
    }

    private boolean dfs(TreeNode root, int sum, int limit) {
        if(root == null) return false;
        if(root.left == null && root.right == null) return sum + root.val >= limit;
        boolean left = dfs(root.left, sum + root.val, limit);
        boolean right= dfs(root.right, sum + root.val, limit);
        if(!left) root.left = null;
        if(!right) root.right = null;
        return left || right;
    }
}
