package day321.Test1;

import java.util.HashMap;
import java.util.Map;

//1726. 同积元组
class Solution {
    public int tupleSameProduct(int[] nums) {
        int res = 0, n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int key = nums[i] * nums[j];
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }
        for (Integer value : map.values()) {
            res += value * (value - 1) * 4;
        }
        return res;
    }
}
