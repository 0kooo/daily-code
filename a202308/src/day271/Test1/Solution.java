package day271.Test1;

//617. 合并二叉树
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return getNewTree(root1, root2);
    }

    private TreeNode getNewTree(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null) return root1 == null ? root2 : root1;
        TreeNode node = new TreeNode(root1.val + root2.val);
        node.left = getNewTree(root1.left, root2.left);
        node.right = getNewTree(root1.right, root2.right);
        return node;
    }
}