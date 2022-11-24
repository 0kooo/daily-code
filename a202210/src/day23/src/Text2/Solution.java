package Text2;

import java.util.*;

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);
        boolean isOrderLeft = true;
        while(!nodes.isEmpty()){
            Deque<Integer> level = new LinkedList<>();
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = nodes.poll();
                if(isOrderLeft){
                    level.offerLast(cur.val);
                }else{
                    level.offerFirst(cur.val);
                }
                if(cur.left != null){
                    nodes.offer(cur.left);
                }
                if(cur.right != null){
                    nodes.offer(cur.right);
                }
            }
            res.add(new LinkedList<>(level));
            isOrderLeft = !isOrderLeft;
        }
        return res;
    }
}
