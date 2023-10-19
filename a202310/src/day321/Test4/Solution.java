package day321.Test4;

import java.util.*;

//113. 路径总和 II
class Solution {
    Deque<Integer> list = new LinkedList<>();
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return res;
    }

    private void dfs(TreeNode root, int target){
        if(root == null) return;
        list.offerLast(root.val);
        target -= root.val;
        if(root.left == null && root.right == null && target == 0) res.add(new ArrayList<>(list));
        dfs(root.left, target);
        dfs(root.right, target);
        list.pollLast();
    }
}
