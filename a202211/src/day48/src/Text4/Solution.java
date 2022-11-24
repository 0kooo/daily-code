package Text4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    /*public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else{
                int val = map.get(num);
                val++;
                map.put(num, val);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }*/
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}