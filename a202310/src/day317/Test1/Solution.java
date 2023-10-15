package day317.Test1;

import java.util.HashMap;
import java.util.Map;

//932. 漂亮数组
class Solution {
    Map<Integer, int[]> map;
    public int[] beautifulArray(int n) {
        map = new HashMap<>();
        return f(n);
    }

    private int[] f(int n) {
        if(map.containsKey(n)) return map.get(n);
        int[] res = new int[n];
        if(n == 1) res[0] = 1;
        else{
            int t = 0;
            for (int num : f((n + 1) / 2)) {
                res[t++] = 2 * num - 1;
            }
            for (int num : f(n / 2)) {
                res[t++] = 2 * num;
            }
        }
        map.put(n, res);
        return res;
    }
}
