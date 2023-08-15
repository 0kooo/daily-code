package day272.Test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//833. 字符串中的查找与替换
class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int n = s.length(), k = indices.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.putIfAbsent(indices[i], new ArrayList<>());
            map.get(indices[i]).add(i);
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n;) {
            boolean flag = false;
            if(map.containsKey(i)){
                for (int value : map.get(i)) {
                    if(s.substring(i, Math.min(i + sources[value].length(), n)).equals(sources[value])){
                        flag = true;
                        res.append(targets[value]);
                        i += sources[value].length();
                        break;
                    }
                }
            }
            if(!flag){
                res.append(s.charAt(i));
                ++i;
            }
        }
        return res.toString();
    }
}
