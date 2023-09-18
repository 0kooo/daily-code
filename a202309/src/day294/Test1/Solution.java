package day294.Test1;

//337. 打家劫舍 III
class Solution {
    public int rob(TreeNode root) {
        int[] res = dfs(root);
        return Math.max(res[0], res[1]);
    }

    private int[] dfs(TreeNode root) {
        if(root == null) return new int[]{0, 0};
        int[] l = dfs(root.left);
        int[] r = dfs(root.right);
        int sum = root.val + l[1] + r[1];
        int notSum = Math.max(r[0], r[1]) + Math.max(l[1], l[0]);
        return new int[]{sum, notSum};
    }
}
