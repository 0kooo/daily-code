package Text2;


import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();
        while(l1 != null){
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            stack2.push(l2.val);
            l2 = l2.next;
        }
        int number = 0;
        ListNode res = null;
        while(!stack1.isEmpty() || !stack2.isEmpty() || number != 0){
            int x = stack1.isEmpty() ? 0 : stack1.pop();
            int y = stack2.isEmpty() ? 0 : stack2.pop();
            int sum = x + y + number;
            number = sum / 10;
            sum = sum % 10;
            ListNode cur = new ListNode(sum);
            cur.next = res;
            res = cur;
        }
        return res;*/
        l1 = reverse(l1);
        l2 = reverse(l2);
        int number = 0;
        ListNode res = new ListNode(0);
        ListNode temp = res;
        while(l1 != null || l2 != null){
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int sum = x + y + number;
            number = sum / 10;
            sum %= 10;
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
        return reverse(res.next);
    }

    private ListNode reverse(ListNode L) {
        if (L == null || L.next == null) {
            return L;
        }
        ListNode newHead = reverse(L.next);
        L.next.next = L;
        L.next = null;
        return newHead;
    }
}
