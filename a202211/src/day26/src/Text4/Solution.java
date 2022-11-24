package Text4;

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return root != null ? dfs(root) : 0;
    }

    public int dfs(TreeNode node){
        int sum = 0;
        if(node.left != null){
            sum += getNode(node.left) ? node.left.val : dfs(node.left);
        }
        if(node.right != null && !getNode(node.right)){
            sum += dfs(node.right);
        }
        return sum;
    }

    public boolean getNode(TreeNode node){
        return node.left == null && node.right == null;
    }
}
