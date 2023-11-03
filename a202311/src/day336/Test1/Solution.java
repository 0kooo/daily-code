package day336.Test1;

import java.util.ArrayDeque;
import java.util.Queue;

//117. 填充每个节点的下一个右侧节点指针 II
class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            Node last = null;
            for (int i = 1; i <= size; i++) {
                Node f = queue.poll();
                if(f.left != null) queue.offer(f.left);
                if(f.right != null) queue.offer(f.right);
                if(i != 1) last.next = f;
                last = f;
            }
        }
        return root;
    }
}