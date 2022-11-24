package Text2;

/*class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        else if(list2 == null) return list1;
        else if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }else{
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
}*/
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l2 == null ? l1 : l2;
        }

        ListNode first = (l2.val < l1.val) ? l2 : l1;
        first.next = mergeTwoLists(first.next, first == l1 ? l2 : l1);
        return first;
    }
}
