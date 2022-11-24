package Text2;

//树的最大深度
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int rightNumber = maxDepth(root.right);
        int leftNumber = maxDepth(root.left);
        return Math.max(rightNumber,leftNumber) + 1;
    }
}
