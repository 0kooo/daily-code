package day356.Test1;

import java.util.HashMap;
import java.util.Map;

//1410. HTML 实体解析器
class Solution {
    public String entityParser(String text) {
        Map<String, String> map = new HashMap<>();
        map.put("&quot;", "\"");
        map.put("&apos;", "'");
        map.put("&amp;", "&");
        map.put("&gt;", ">");
        map.put("&lt;", "<");
        map.put("&frasl;", "/");
        StringBuilder res = new StringBuilder();
        int i = 0, n = text.length();
        while (i < n){
            boolean found = false;
            for (int l = 1; l < 8; ++l){
                int j = i + l;
                if(j <= n){
                    String t = text.substring(i, j);
                    if(map.containsKey(t)){
                        res.append(map.get(t));
                        i = j;
                        found = true;
                        break;
                    }
                }
            }
            if(!found) res.append(text.charAt(i++));
        }
        return res.toString();
    }
}
