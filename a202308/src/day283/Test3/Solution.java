package day283.Test3;

import java.util.ArrayList;
import java.util.List;

//257. 二叉树的所有路径
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        constructPaths(root, "", res);
        return res;
    }

    private void constructPaths(TreeNode root, String s, List<String> list) {
        if(root != null){
            StringBuilder sb = new StringBuilder(s);
            sb.append(Integer.toString(root.val));
            if(root.left == null && root.right == null) list.add(sb.toString());
            else{
                sb.append("->");
                constructPaths(root.left, sb.toString(), list);
                constructPaths(root.right, sb.toString(), list);
            }
        }
    }
}