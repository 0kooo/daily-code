package day374.Test1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

//2415. 反转二叉树的奇数层
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        boolean isOdd = false;
        queue.offer(root);
        while (!queue.isEmpty()){
            int sz = queue.size();
            List<TreeNode> arr = new ArrayList<>();
            for (int i = 0; i < sz; i++){
                TreeNode node = queue.poll();
                if(isOdd) arr.add(node);
                if(node.left != null) {
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
            if(isOdd){
                for (int l = 0, r = sz - 1; l < r; l++, r--){
                    int temp = arr.get(l).val;
                    arr.get(l).val = arr.get(r).val;
                    arr.get(r).val = temp;
                }
            }
            isOdd ^= true;
        }
        return root;
    }
}