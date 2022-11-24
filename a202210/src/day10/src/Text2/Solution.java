package Text2;

import java.util.HashSet;
import java.util.Set;

/*class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode temp = head;
        while(temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
}*/
class Solution{
    public ListNode deleteDuplicates(ListNode head){
        if(head == null) return head;
        Set<Integer> set = new HashSet<>();
        ListNode per = head;
        ListNode ret = per;
        set.add(head.val);
        while(head != null){
            if(!set.contains(head.val)){
                set.add(head.val);
                per.next = head;
                per = per.next;
            }
            head = head.next;
        }
        per.next = null;
        return ret;
    }
}
