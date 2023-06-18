package day235.Test3;

import java.util.HashMap;
import java.util.Map;

//1287. ���������г��ִ�������25%��Ԫ��
class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int temp = (int) (arr.length * 0.25);
        int res = 0;
        for (Integer key : map.keySet()) {
            if(map.get(key) > temp) res = key;
        }
        return res;
    }
}
