package day166.Test2;

import java.util.HashMap;
import java.util.Map;

//219. 存在重复元素 II
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(map.containsKey(num)){
                int index = map.get(num);
                if(i - index <= k) return true;
            }
            map.put(num, i);
        }
        return false;
    }
}
