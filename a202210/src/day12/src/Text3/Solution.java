package Text3;

import java.util.ArrayList;
import java.util.List;

//树的后序遍历
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorder(root,res);
        return res;
    }

    public void postorder(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }
}
