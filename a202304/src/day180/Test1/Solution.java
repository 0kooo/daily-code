package day180.Test1;

import java.util.HashMap;
import java.util.Map;

//2404. 出现最频繁的偶数元素
class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0, res = Integer.MAX_VALUE;
        for (int num : nums) {
            if(num % 2 == 0){
                map.put(num, map.getOrDefault(num, 0) + 1);
                if(map.get(num) > max) max = map.get(num);
            }

        }
        for (int key : map.keySet()) {
            int value = map.get(key);
            if(max == value && res > key) res = key;
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
