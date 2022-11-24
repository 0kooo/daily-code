package Text1;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        int number = 0;
        ListNode temp = res;
        while(l1 != null || l2 != null){
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int sum = x + y + number;
            number = sum / 10;
            sum = sum % 10;
            temp.next = new ListNode(sum);
            temp = temp.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            if(number == 1){
                temp.next = new ListNode(number);
            }
        }
        return res.next;
    }
}
