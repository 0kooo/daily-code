package day181.Test1;

import java.util.ArrayList;
import java.util.List;

//1023. 驼峰式匹配
class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res = new ArrayList<>();
        int n = pattern.length();
        for (int i = 0; i < queries.length; i++) {
            int p = 0;
            boolean flag = true;
            for (int j = 0; j < queries[i].length(); j++) {
                char c = queries[i].charAt(j);
                if (p < n && pattern.charAt(p) == c){
                    p++;
                }else if(Character.isUpperCase(c)){
                   flag = false;
                   break;
                }
            }
            if(p < n) flag = false;
            res.add(flag);
        }
        return res;
    }
}
