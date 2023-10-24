package day326.Test3;

//222. 完全二叉树的节点个数
class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        return dfs(root);
    }

    private int dfs(TreeNode root) {
        if(root == null) return 0;
        return dfs(root.left) + dfs(root.right) + 1;
    }
}
