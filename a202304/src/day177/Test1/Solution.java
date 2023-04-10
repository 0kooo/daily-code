package day177.Test1;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

//1019. 链表中的下一个更大节点
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        Deque<int[]> stack = new ArrayDeque<>();

        ListNode cur = head;
        int index = -1;
        while (cur != null){
            ++index;
            list.add(0);
            while (!stack.isEmpty() && stack.peek()[0] < cur.val){
                list.set(stack.pop()[1], cur.val);
            }
            stack.push(new int[]{cur.val, index});
            cur = cur.next;
        }
        int size = list.size();
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
