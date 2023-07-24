package day253.Test3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//229. 多数元素 II
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if(map.get(key) > n / 3) res.add(key);
        }
        return res;
    }
}