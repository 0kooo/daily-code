package Text2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

class BSTIterator {
    private TreeNode res;
    private Deque<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        res = root;
        stack = new LinkedList<>();
    }

    public int next() {
        while(res != null){
            stack.push(res);
            res = res.left;
        }
        res = stack.pop();
        int num = res.val;
        res =  res.right;
        return num;
    }

    public boolean hasNext() {
        return res != null || !stack.isEmpty();
    }
}
