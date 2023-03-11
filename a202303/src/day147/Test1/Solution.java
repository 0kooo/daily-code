package day147.Test1;

import java.util.HashMap;
import java.util.Map;
/*
* 面试题 17.05. 字母与数字
* */
class Solution {
    public String[] findLongestSubarray(String[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int s = 0, max = 0, k = 0;
        for (int i = 0; i < array.length; i++) {
            s += array[i].charAt(0) >= 'A' ? 1 : -1;
            if(map.containsKey(s)){
                int j = map.get(s);
                if(max < i - j){
                    max = i - j;
                    k = j + 1;
                }
            }else{
                map.put(s, i);
            }
        }
        String[] ret = new String[max];
        System.arraycopy(array, k, ret, 0, max);
        return ret;
    }
}
