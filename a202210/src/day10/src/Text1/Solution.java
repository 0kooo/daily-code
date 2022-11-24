package Text1;

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode per = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = per;
            per = cur;
            cur = next;
        }
        return per;
    }
}
