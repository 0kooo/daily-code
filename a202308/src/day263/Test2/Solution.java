package day263.Test2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//399. 除法求值
class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int len = equations.size();
        UnionFind unionFind = new UnionFind(2 * len);
        Map<String, Integer> map = new HashMap<>();
        int id = 0;
        for (int i = 0; i < len; i++) {
            List<String> list = equations.get(i);
            String var1 = list.get(0);
            String var2 = list.get(1);
            if(!map.containsKey(var1)){
                map.put(var1, id);
                id++;
            }
            if(!map.containsKey(var2)){
                map.put(var2, id);
                id++;
            }
            unionFind.union(map.get(var1), map.get(var2), values[i]);
        }
        int n = queries.size();
        double[] res = new double[n];
        for (int i = 0; i < n; i++) {
            String var1 = queries.get(i).get(0);
            String var2 = queries.get(i).get(1);
            Integer id1 = map.get(var1);
            Integer id2 = map.get(var2);
            if(id1 == null || id2 == null)res[i] = -1.0d;
            else res[i] = unionFind.isConnected(id1, id2);
        }
        return res;
    }
}
