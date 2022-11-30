package day55.Text3;

class Solution {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int m1 = minDepth(root.left);
        int m2 = minDepth(root.right);
        return root.left == null || root.right == null ? m1 + m2 + 1 : Math.min(m1,m2);
    }
}
