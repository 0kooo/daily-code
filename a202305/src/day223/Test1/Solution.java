package day223.Test1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//1110. 删点成林
class Solution {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> set = new HashSet<>();
        for (int i : to_delete) {
            set.add(i);
        }
        List<TreeNode> res = new ArrayList<>();
        dfs(root, true, set, res);
        return res;
    }

    private TreeNode dfs(TreeNode node, boolean isRoot, Set<Integer> set, List<TreeNode> res) {
        if(node == null) return null;
        boolean delete = set.contains(node.val);
        node.left = dfs(node.left, delete, set, res);
        node.right = dfs(node.right, delete, set, res);
        if(delete){
            return null;
        }else{
            if(isRoot){
                res.add(node);
            }
            return node;
        }
    }
}
