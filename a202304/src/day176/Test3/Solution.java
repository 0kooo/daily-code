package day176.Test3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//1436. 旅行终点站
class Solution {
    public String destCity(List<List<String>> paths) {
        StringBuilder res = new StringBuilder();
        Map<String, String> map = new HashMap<>();
        int n = paths.size();
        for (int i = 0; i < n; i++) {
            map.put(paths.get(i).get(0), paths.get(i).get(1));
        }

        for (int i = 0; i < n; i++) {
            String value = paths.get(i).get(1);
            if(!map.containsKey(value)) res.append(value);
        }
        return res.toString();
    }
}
