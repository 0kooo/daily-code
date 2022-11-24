package Text1;

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            ++len;
            temp = temp.next;
        }
        int number = k % len;
        if(number == 0){
            return head;
        }
        ListNode end = null;
        for (int i = 0; i <= number; i++) {
            ListNode list = head;
            while(true){
                if(list.next.next == null){
                    end = list.next;
                    list.next = null;
                    break;
                }else{
                    list = list.next;
                }
            }
            end.next = head;
            head = end;
            end = null;
        }
        return head;
    }
}
