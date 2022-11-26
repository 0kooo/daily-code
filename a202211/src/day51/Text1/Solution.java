package day51.Text1;

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return g(nums, 0, nums.length - 1);
    }

    public TreeNode g(int[] nums, int i, int j){
        if(i > j){
            return null;
        }
        int mid = (i + j) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = g(nums, i, mid - 1);
        node.right = g(nums, mid + 1, j);
        return node;
    }
}
