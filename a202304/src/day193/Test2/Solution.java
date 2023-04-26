package day193.Test2;

import java.util.HashMap;
import java.util.Map;

//2206. 将数组划分成相等数对
class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (int key : map.keySet()) {
            res += map.get(key) / 2;
        }
        return res == (n / 2);
    }
}
