package day331.Test1;

//129. 求根节点到叶节点数字之和
class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int sum) {
        if(root == null) return 0;
        sum = sum * 10 + root.val;
        if(root.left == null && root.right == null) return sum;
        else return dfs(root.left, sum) + dfs(root.right, sum);
    }
}
