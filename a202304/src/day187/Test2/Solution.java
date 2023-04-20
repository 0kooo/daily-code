package day187.Test2;

import java.util.HashMap;
import java.util.Map;

//2053. 数组中第 K 个独一无二的字符串
class Solution {
    public String kthDistinct(String[] arr, int k) {
        StringBuilder res = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int count = 0;
        for (String s : arr) {
            if(map.get(s) == 1){
                count++;
            }
            if(count == k){
                res.append(s);
                break;
            }
        }
        return res.toString();
    }
}
