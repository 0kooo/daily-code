package Text1;

public class text {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(0);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l2;
        ListNode head = l1;
        Solution s = new Solution();
        boolean result = s.hasCycle(head);
        System.out.println(result);
    }
}
