package day281.Test1;

import java.util.HashSet;
import java.util.Set;

//160. 相交链表
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode temp = headA;
        while (temp != null){
            set.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null){
            if(set.contains(temp)) return temp;
            temp = temp.next;
        }
        return null;
    }
}
