package day359.Test2;

import java.util.ArrayList;
import java.util.List;

//894. 所有可能的真二叉树
class Solution {
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> res = new ArrayList<>();
        if(n % 2 == 0) return res;
        if(n == 1) {
            res.add(new TreeNode(0));
            return res;
        }
        for (int l = 1, r = n - 2; l < n; l++, r--){
            List<TreeNode> left = allPossibleFBT(l);
            List<TreeNode> right = allPossibleFBT(r);
            for (TreeNode leftTreeNode : left) {
                for (TreeNode rightTreeNode : right) {
                    TreeNode root = new TreeNode(0, leftTreeNode, rightTreeNode);
                    res.add(root);
                }
            }
        }
        return res;
    }
}