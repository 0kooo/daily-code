package day125.Text1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            int value = entry.getValue();
            res[0] += value / 2;
            res[1] += value % 2;
        }
        return res;
    }
}
/*class Solution {
    public int[] numberOfPairs(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return new int[]{0, 1};
        }
        int pair = 0, used = 0;
        int a = -1, b = -100;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j]) {
                    nums[i] = (a--);
                    nums[j] = (b--);
                    pair++;
                    used += 2;
                }
            }
        }
        return new int[]{pair, len - used};
    }
}*/