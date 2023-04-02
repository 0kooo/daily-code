package day169.Test2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//961. 在长度 2N 的数组中找出重复 N 次的元素
class Solution {
    public int repeatedNTimes(int[] nums) {
        /*int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (int i : map.keySet()) {
            int value = map.get(i);
            if (value == n / 2) {
                res = i;
                break;
            }
        }
        return res;*/
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return -1;
    }
}
