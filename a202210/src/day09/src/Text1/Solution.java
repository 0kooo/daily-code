package Text1;

import java.util.HashSet;
import java.util.Set;

/*public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode fast = head.next;
        ListNode low = head;
        while(fast != low){
            if(fast == null || fast.next == null){
                return false;
            }
            low = low.next;
            fast = fast.next.next;
        }
        return true;
    }
}*/
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head != null){
            if(!set.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
