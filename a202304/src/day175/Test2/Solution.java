package day175.Test2;

import java.util.HashMap;
import java.util.Map;

//1394. 找出数组中的幸运数
class Solution {
    public int findLucky(int[] arr) {
        /*Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int res = 0;
        for (int key : map.keySet()) {
            if(key == map.get(key)){
                if(res < key){
                    res = key;
                }
            }
        }
        return res;*/

        int[] list = new int[501];
        for (int i : arr) {
            list[i]++;
        }
        for(int i = 499; i >= 0; i--){
            if(list[i] == i) return i;
        }
        return -1;
    }
}
