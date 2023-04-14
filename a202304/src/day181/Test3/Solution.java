package day181.Test3;


import java.util.HashMap;
import java.util.Map;

//1748. 唯一元素的和
class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if(map.get(key) == 1) res += key;
        }
        return res;
    }
}
