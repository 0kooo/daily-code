package Text2;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public void reorderList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode node = head;
        while(node != null){
            list.add(node);
            node = node.next;
        }
        int i = 0;
        int j = list.size() - 1;
        while(i < j){
            list.get(i).next = list.get(j);
            i++;
            if(i == j){
                break;
            }
            list.get(j).next = list.get(i);
            j--;
        }
        list.get(i).next = null;
    }
}
