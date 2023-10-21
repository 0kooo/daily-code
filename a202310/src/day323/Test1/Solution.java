package day323.Test1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

//2316. 统计无向图中无法互相到达点对数
class Solution {
    public long countPairs(int n, int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }
        boolean[] flags = new boolean[n];
        int left = n;
        long res = 0L;
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if(!flags[i]){
                flags[i] = true;
                queue.offer(i);
                int count = 1;
                while (!queue.isEmpty()){
                    for (int next : list.get(queue.poll())) {
                        if(!flags[next]){
                            flags[next] = true;
                            queue.offer(next);
                            count++;
                        }
                    }
                }
                left -= count;
                res += (long) count * left;
            }
        }
        return res;
    }
}
