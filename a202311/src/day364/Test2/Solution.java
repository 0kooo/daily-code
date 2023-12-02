package day364.Test2;

import java.util.ArrayList;
import java.util.List;

//1282. 用户分组
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList[] list = new ArrayList[groupSizes.length + 1];
        for (int i = 0; i < groupSizes.length; i++) {
            int key = groupSizes[i];
            if(list[key] == null) list[key] = new ArrayList();
            list[key].add(i);
            if(key == list[key].size()){
                res.add(new ArrayList<>(list[key]));
                list[key].clear();
            }
        }
        return res;
    }
}