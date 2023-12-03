package day365.Test2;

//1302. 层数最深叶子节点的和
class Solution {
    int res = 0, deep = -1;
    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return res;
    }

    private void dfs(TreeNode node, int level) {
        if(node == null) return;
        if(level > deep){
            deep = level;
            res = node.val;
        }else if(level == deep) res += node.val;
        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }
}