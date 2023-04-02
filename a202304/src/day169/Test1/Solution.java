package day169.Test1;


import java.util.HashMap;
import java.util.Map;

//1039. 多边形三角剖分的最低得分
class Solution {
    int n;
    int[] values;
    Map<Integer, Integer> map = new HashMap<>();

    public int minScoreTriangulation(int[] values) {
        this.n = values.length;
        this.values = values;
        return dp(0, n - 1);
    }

    private int dp(int i, int j) {
        if(i + 2 > j) return 0;
        if(i + 2 == j) return values[i] * values[i + 1] * values[j];
        int key = i * n + j;
        if(!map.containsKey(key)){
            int min = Integer.MAX_VALUE;
            for(int k = i + 1; k < j; k++){
                min = Math.min(min, values[i] * values[k] * values[j] + dp(i, k) + dp(k, j));
            }
            map.put(key, min);
        }
        return map.get(key);
    }
}
