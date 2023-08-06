package day264.Test1;

//24. 两两交换链表中的节点
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode res = head.next;
        head.next = swapPairs(res.next);
        res.next = head;
        return res;
    }
}
