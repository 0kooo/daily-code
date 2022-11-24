package Text1;

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        return Math.abs(balanced(root.left) - balanced(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int balanced(TreeNode node){
        if(node == null){
            return 0;
        }
        return Math.max(balanced(node.left),balanced(node.right)) + 1;
    }
}
