package day381.Test1;

//1026. 节点与其祖先之间的最大差值
class Solution {
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }

    private int dfs(TreeNode root, int max, int min) {
        if(root == null) return 0;
        int res = Math.max(Math.abs(root.val - max), Math.abs(root.val - min));
        max = Math.max(root.val, max);
        min = Math.min(root.val, min);
        res = Math.max(res, dfs(root.left, max, min));
        res = Math.max(res, dfs(root.right, max, min));
        return res;
    }
}