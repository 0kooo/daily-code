package day326.Test2;

import java.util.ArrayDeque;
import java.util.Deque;

//230. 二叉搜索树中第K小的元素
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        while (root != null || !deque.isEmpty()){
            while (root != null){
                deque.push(root);
                root = root.left;
            }
            root = deque.pop();
            --k;
            if(k == 0) break;
            root = root.right;
        }
        return root.val;
    }
}
