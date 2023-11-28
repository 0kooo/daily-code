package day361.Test2;

//2807. 在链表中插入最大公约数
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode left = head, right = left.next;
        while (right != null){
            int max = Math.max(left.val, right.val);
            int min = Math.min(left.val, right.val);
            int node = max % min == 0 ? min : gcd(min, max);
            left.next = new ListNode(node);
            left.next.next = right;
            left = right;
            right = right.next;
        }
        return head;
    }

    private int gcd(int max, int min) {
        return min == 0 ? max : gcd(min, max % min);
    }
}
