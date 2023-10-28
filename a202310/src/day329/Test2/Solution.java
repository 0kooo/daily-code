package day329.Test2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

//797. 所有可能的路径
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    Deque<Integer> deque = new ArrayDeque<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        deque.offerLast(0);
        dfs(graph, 0, graph.length - 1);
        return res;
    }

    private void dfs(int[][] graph, int x, int n) {
        if(x == n){
            res.add(new ArrayList<>(deque));
            return;
        }
        for (int num : graph[x]) {
            deque.offerLast(num);
            dfs(graph, num, n);
            deque.pollLast();
        }
    }
}
