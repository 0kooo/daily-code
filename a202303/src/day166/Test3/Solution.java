package day166.Test3;

import java.util.Arrays;
import java.util.HashMap;

//594. 最长和谐子序列
class Solution {
    public int findLHS(int[] nums) {
        /*HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (int num : hm.keySet()) {
            if(hm.containsKey(num + 1)){
                res = Math.max(res, hm.get(num) + hm.get(num + 1));
            }
        }
        return res;*/
        Arrays.sort(nums);
        int res = 0;
        for(int left = 0, right = 0; right < nums.length; right++){
            while (left < right && nums[right] - nums[left] > 1) left++;
            if(nums[right] - nums[left] == 1) res = Math.max(right - left + 1, res);
        }
        return res;
    }
}
