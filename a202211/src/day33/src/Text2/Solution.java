package Text2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int len = num.length;
        for (int i = len - 1; i >= 0 || k > 0; --i , k /= 10) {
            if(i >= 0){
                k += num[i];
            }
            list.add(k % 10);
        }
        Collections.reverse(list);
        return list;
    }
}
