package day325.Test2;

//114. 二叉树展开为链表
class Solution {
    public void flatten(TreeNode root) {
        while (root != null){
            if(root.left == null) root = root.right;
            else{
                TreeNode pre = root.left;
                while (pre.right != null) pre = pre.right;
                pre.right = root.right;
                root.right = root.left;
                root.left = null;
                root = root.right;
            }
        }
    }
}
