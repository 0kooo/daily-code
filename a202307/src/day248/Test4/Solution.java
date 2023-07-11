package day248.Test4;

import java.util.HashMap;
import java.util.Map;

//105. 从前序与中序遍历序列构造二叉树
class Solution {
    Map<Integer, Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return dfs(preorder, inorder, 0, n - 1, 0, n - 1);
    }

    private TreeNode dfs(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
        if(preorder_left > preorder_right) return null;
        int inorder_root = map.get(preorder[preorder_left]);
        TreeNode root = new TreeNode(preorder[preorder_left]);
        int size = inorder_root - inorder_left;
        root.left = dfs(preorder, inorder, preorder_left + 1, preorder_left + size, inorder_left, inorder_root - 1);
        root.right = dfs(preorder, inorder, preorder_left + size + 1, preorder_right, inorder_root + 1, inorder_right);
        return root;
    }
}
