package day136.Text3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if(entry.getValue() == 1){
                res = entry.getKey();
            }
        }
        return res;
    }
}
/*
* class Solution {
    public int singleNumber(int[] nums) {
        int ones=0,twos=0;
        for(int num:nums){
            ones=ones^num&~twos;
            twos=twos^num&~ones;
        }
        return ones;
    }
}*/
