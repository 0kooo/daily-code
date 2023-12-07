package day369.Test1;

import java.util.ArrayList;
import java.util.List;

//1466. 重新规划路线
class Solution {
    public int minReorder(int n, int[][] connections) {
        List<int[]>[] list = new List[n];
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }
        for (int[] connection : connections) {
            list[connection[0]].add(new int[]{connection[1], 1});
            list[connection[1]].add(new int[]{connection[0], 0});
        }
        return dfs(0, -1, list);
    }

    private int dfs(int x, int y, List<int[]>[] list) {
        int res = 0;
        for (int[] a : list[x]) {
            if(a[0] == y) continue;
            res += a[1] +dfs(a[0], x, list);
        }
        return res;
    }
}