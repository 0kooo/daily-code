package Text1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    public void helper(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        for (Node ch : root.children) {
            helper(ch, list);
        }
    }
}
