package day367.Test1;

import java.util.ArrayList;
import java.util.List;

//2477. 到达首都的最少油耗
class Solution {
    int res = 0;
    public long minimumFuelCost(int[][] roads, int seats) {
        int n = roads.length;
        List<Integer>[] list = new List[n + 1];
        for (int i = 0; i <= n; i++) list[i] = new ArrayList<Integer>();
        for (int[] road : roads) {
            list[road[0]].add(road[1]);
            list[road[1]].add(road[0]);
        }
        dfs(0, -1, seats, list);
        return res;
    }

    private int dfs(int cur, int father, int seats, List<Integer>[] list) {
        int sum = 1;
        for (int g : list[cur]) {
            if(g != father){
                int cnt = dfs(g, cur, seats, list);
                sum += cnt;
                res += (cnt + seats - 1) / seats;
            }
        }
        return sum;
    }
}