package day269.Test1;

//23. 合并 K 个升序链表
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = null;
        for (ListNode list : lists) {
            res = linkList(res, list);
        }
        return res;
    }

    private ListNode linkList(ListNode a, ListNode b) {
        if(a == null || b == null) return a != null ? a : b;
        ListNode head = new ListNode(0);
        ListNode temp = head, perA = a, perB = b;
        while (perA != null && perB != null){
            if(perA.val < perB.val){
                temp.next = perA;
                perA = perA.next;
            }else{
                temp.next = perB;
                perB = perB.next;
            }
            temp = temp.next;
        }
        temp.next = (perA != null ? perA : perB);
        return head.next;
    }
}
