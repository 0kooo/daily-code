package Text2;


class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        int index = len / 2;
        for(int i = 0; i < index; ++i){
            head = head.next;
        }
        return head;
    }
}
