package day358.Test1;

//1457. 二叉树中的伪回文路径
class Solution {
    public int pseudoPalindromicPaths (TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int path) {
        if(root == null) return 0;
        path ^= 1 << root.val;
        if(root.left == null && root.right == null) return (path & (path - 1)) == 0 ? 1 : 0;
        return dfs(root.left, path) + dfs(root.right, path);
    }
}