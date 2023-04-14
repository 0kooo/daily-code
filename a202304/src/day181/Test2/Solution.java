package day181.Test2;

import java.util.HashMap;
import java.util.Map;

//1742. 盒子中小球的最大数量
class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = lowLimit; i <= highLimit; i++){
            int sum = 0, temp = i;
            while (temp != 0){
                sum += (temp % 10);
                temp /= 10;
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        int res = 0;
        for (int key : map.keySet()) {
            if(res < map.get(key)) res = map.get(key);
        }
        return res;
    }
}
