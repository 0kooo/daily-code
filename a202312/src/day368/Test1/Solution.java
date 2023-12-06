package day368.Test1;

import java.util.ArrayList;
import java.util.List;

//2646. 最小化旅行的价格总和
class Solution {
    public int minimumTotalPrice(int n, int[][] edges, int[] price, int[][] trips) {
        List<Integer>[] next = new List[n];
        for (int i = 0; i < n; i++) next[i] = new ArrayList<>();
        for (int[] edge : edges) {
            next[edge[0]].add(edge[1]);
            next[edge[1]].add(edge[0]);
        }
        int[] count = new int[n];
        for (int[] trip : trips) dfs(trip[0], -1, trip[1], next, count);
        int[] pair = dp(0, -1, price, next, count);
        return Math.min(pair[0], pair[1]);
    }

    private int[] dp(int node, int parent, int[] price, List<Integer>[] next, int[] count) {
        int[] res = {price[node] * count[node], price[node] * count[node] / 2};
        for (int child : next[node]) {
            if(child == parent) continue;
            int[] pair = dp(child, node, price, next, count);
            res[0] += Math.min(pair[0], pair[1]);
            res[1] += pair[0];
        }
        return res;
    }

    private boolean dfs(int node, int parent, int end, List<Integer>[] next, int[] count) {
        if(node == end){
            count[node]++;
            return true;
        }
        for (int child : next[node]) {
            if(child == parent) continue;
            if(dfs(child, node, end, next, count)){
                count[node]++;
                return true;
            }
        }
        return false;
    }
}
