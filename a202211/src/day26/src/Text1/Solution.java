package Text1;

import java.util.ArrayList;

class Solution {
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        int res = 0;
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == 1){
                res += Math.pow(2, list.size() - (i + 1));
            }
        }
        return (int)res;
    }
}