package day149.Test2;


import java.util.HashMap;
import java.util.Map;
//#645 错误的集合
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ret = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i <= nums.length; i++) {
            int count = map.getOrDefault(i, 0);
            if(count == 2){
                ret[0] = i;
            }else if(count == 0){
                ret[1] = i;
            }
        }
        return ret;
    }
}