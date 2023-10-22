package day324.Test3;

import java.util.ArrayList;
import java.util.List;

//501. 二叉搜索树中的众数
class Solution {
    List<Integer> list = new ArrayList<>();
    int count, base, MaxCount;
    public int[] findMode(TreeNode root) {
        dfs(root);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    private void dfs(TreeNode node) {
        if(node == null) return;
        dfs(node.left);
        updateList(node.val);
        dfs(node.right);
    }

    private void updateList(int val) {
        if(base == val) count++;
        else{
            count = 1;
            base = val;
        }
        if(count == MaxCount){
            list.add(base);
        }
        if(count > MaxCount){
            MaxCount = count;
            list.clear();
            list.add(base);
        }
    }
}
