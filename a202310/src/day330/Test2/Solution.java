package day330.Test2;

import java.util.ArrayDeque;
import java.util.Deque;

//116. 填充每个节点的下一个右侧节点指针
class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(root);
        while (!deque.isEmpty()){
            int n = deque.size();
            for (int i = 0; i < n; i++) {
                Node nod = deque.poll();
                if(i < n - 1) nod.next = deque.peek();
                if(nod.left != null) deque.add(nod.left);
                if(nod.right != null) deque.add(nod.right);
            }
        }
        return root;
    }
}