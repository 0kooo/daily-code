package day185.Test1;

//1026. 节点与其祖先之间的最大差值
class Solution {
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }

    public int dfs(TreeNode root, int min, int max) {
        if(root == null){
            return 0;
        }
        int diff = Math.max(Math.abs(root.val - min), Math.abs(root.val - max));
        max = Math.max(root.val, max);
        min = Math.min(root.val, min);
        diff = Math.max(diff, dfs(root.left, min, max));
        diff = Math.max(diff, dfs(root.right, min, max));
        return diff;
    }
}
