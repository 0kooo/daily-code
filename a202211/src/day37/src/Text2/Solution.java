package Text2;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        Deque<Node> stack = new LinkedList<>();
        stack.offer(root);
        while(!stack.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                Node cur = stack.poll();
                level.add(cur.val);
                for (Node child : cur.children) {
                    stack.offer(child);
                }
            }
            res.add(level);
        }
        return res;
    }
}
