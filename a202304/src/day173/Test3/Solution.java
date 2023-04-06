package day173.Test3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//1331. 数组序号转换
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int[] sortArr = new int[n];
        System.arraycopy(arr, 0, sortArr, 0, n);
        Arrays.sort(sortArr);
        Map<Integer, Integer> map = new HashMap<>();
        for (int s : sortArr) {
            if(!map.containsKey(s)){
                map.put(s, map.size() + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            res[i] = map.get(arr[i]);
        }
        return res;
    }
}
