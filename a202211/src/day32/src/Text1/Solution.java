package Text1;

class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root == null) return false;
        return judge(head,root) || isSubPath(head,root.right) || isSubPath(head,root.left);
    }

    public boolean judge(ListNode head, TreeNode root){
        if(head == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(root.val != head.val) {
            return false;
        }
        return judge(head.next,root.left) || judge(head.next,root.right);
    }
}
