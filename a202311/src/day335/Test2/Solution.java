package day335.Test2;

import java.util.ArrayList;
import java.util.List;

//526. 优美的排列
class Solution {
    int res;
    boolean[] vis;
    List<Integer>[] match;
    public int countArrangement(int n) {
        match = new List[n + 1];
        vis = new boolean[n + 1];
        for (int i = 0; i <= n; i++) match[i] = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i % j == 0 || j % i == 0) match[i].add(j);
            }
        }
        dfs(1, n);
        return res;
    }

    private void dfs(int index, int n) {
        if(index == n + 1) {
            res++;
            return;
        }
        for (int num : match[index]) {
            if(!vis[num]){
                vis[num] = true;
                dfs(index + 1, n);
                vis[num] = false;
            }
        }
    }
}
