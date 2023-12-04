package day366.Test2;

//2181. 合并零之间的节点
class Solution {
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode res = new ListNode();
        ListNode temp = res;
        head = head.next;
        while (head != null){
            if(head.val == 0){
                temp.next = new ListNode(sum);
                temp = temp.next;
                sum = 0;
            }
            else sum += head.val;
            head = head.next;
        }
        return res.next;
    }
}