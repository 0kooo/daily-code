package day167.Test3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//599. 两个列表的最小索引总和
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int min = 2000;
        for (int i = 0; i < list2.length; i++) {
            String s = list2[i];
            if(map.containsKey(list2[i])){
                int indexSum = i + map.get(list2[i]);
                if(indexSum < min){
                    min = indexSum;
                    list.clear();
                    list.add(s);
                }else if(indexSum == min){
                    list.add(s);
                }
            }
        }
        return list.toArray(new String[0]);
    }
}
