package day195.Test3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//1338 数组大小减半
class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i ,map.getOrDefault(i, 0) + 1);
        }
        Integer[] a = map.values().toArray(new Integer[0]);
        Arrays.sort(a);
        int count = 0;
        for(int i = a.length - 1; i >= 0; i--){
            count += a[i];
            if(count >= arr.length / 2){
                return a.length - i;
            }
        }
        return -1;
    }
}
