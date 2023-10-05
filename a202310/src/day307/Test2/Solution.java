package day307.Test2;

//25. K 个一组翻转链表
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode per = dummy;
        ListNode end = dummy;
        while (end.next != null){
            for (int i = 0; i < k && end != null; i++) end = end.next;
            if(end == null) break;
            ListNode start = per.next;
            ListNode next = end.next;
            end.next = null;
            per.next = reverse(start);
            start.next = next;
            per = start;
            end = per;
        }
        return dummy.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode per = null;
        ListNode curr = head;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = per;
            per = curr;
            curr = next;
        }
        return per;
    }
}
