package day179.Test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//811. 子域名访问计数
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : cpdomains) {
            String[] s1 = s.split("\\s+");
            String[] s2 = s1[1].split("\\.");
            String domain = "";
            for(int i = s2.length - 1; i >= 0; i--){
                if(i < s2.length - 1) domain = "." + domain;
                domain = s2[i] + domain;
                int times = map.getOrDefault(domain, 0) + Integer.parseInt(s1[0]);
                map.put(domain, times);
            }
        }
        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            list.add(map.get(key) + " " + key);
        }
        return list;
    }
}
