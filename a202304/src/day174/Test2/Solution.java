package day174.Test2;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//1365. 有多少小于当前数字的数字
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        /*int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(nums[j] < nums[i])res[i]++;
            }
        }
        return res;*/
        int n = nums.length;
        int[] res = Arrays.copyOf(nums, n);
        Arrays.sort(res);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(!map.containsKey(res[i])){
                map.put(res[i], i);
            }
        }
        for (int i = 0; i < n; i++) {
            res[i] = map.get(nums[i]);
        }
        return res;
    }
}
