package day366.Test1;

//1038. 从二叉搜索树到更大和树
class Solution {
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root != null){
            bstToGst(root.right);
            sum += root.val;
            root.val = sum;
            bstToGst(root.left);
        }
        return root;
    }
}
