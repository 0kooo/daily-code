package day249.Test3;

import java.util.Deque;
import java.util.LinkedList;

//106. 从中序与后序遍历序列构造二叉树
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder == null || postorder.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        int inorderIndex = inorder.length - 1;
        for (int i = postorder.length - 2; i >= 0; i--){
            int postorderVal = postorder[i];
            TreeNode node = stack.peek();
            if(node.val != inorder[inorderIndex]){
                node.right = new TreeNode(postorderVal);
                stack.push(node.right);
            }else{
                while (!stack.isEmpty() && stack.peek().val == inorder[inorderIndex]){
                    node = stack.pop();
                    inorderIndex--;
                }
                node.left = new TreeNode(postorderVal);
                stack.push(node.left);
            }
        }
        return root;
    }
}
