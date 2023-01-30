package day108.Text1;

class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode pre = list1;
        for (int i = 0; i < a - 1; i++) {
            pre = pre.next;
        }
        ListNode end = pre;
        for (int i = 0; i < b - a + 2; i++) {
            end = end.next;
        }
        pre.next = list2;
        while(list2.next != null){
            list2 = list2.next;
        }
        list2.next = end;
        return list1;
    }
}
