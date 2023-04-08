package day175.Test3;

import java.util.HashMap;
import java.util.Map;

//1399. 统计最大组的数目
class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1, res = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int temp = i;
            while (temp != 0){
                int ge = temp % 10;
                sum += ge;
                temp /= 10;
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            max = max < map.get(sum) ? map.get(sum) : max;
        }
        /*for (int key : map.keySet()) {
            int value = map.get(key);
            if(max < value) max = value;
        }*/
        for (int key : map.keySet()) {
            if(max == map.get(key)) res++;
        }
        return res;
    }
}
