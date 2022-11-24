package Text3;

/*class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        head.next = removeElements(head.next,val);
        return head.val == val ? head.next : head;
    }
}*/
class Solution{
    public ListNode removeElements(ListNode head, int val){
        if(head == null) return head;
        ListNode newHead = new ListNode(0);
        ListNode per = newHead;
        ListNode tail = null;
        while(head != null){
            if(head.val != val){
                per.next = head;
                head = head.next;
                per = per.next;
                per.next = tail;
            }else{
                head = head.next;
            }
        }
        return newHead.next;
    }
}
