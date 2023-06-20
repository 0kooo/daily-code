package day236.Test3;

import java.util.ArrayList;
import java.util.List;

//1409. 查询带键的排列
class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            list.add(i);
        }
        int n = queries.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = queries[i];
            int pre = -1;
            for (int j = 0; j < m; j++) {
                if(list.get(j) == temp){
                    pre = j;
                    break;
                }
            }
            res[i] = pre;
            list.remove(pre);
            list.add(0, temp);
        }
        return res;
    }
}