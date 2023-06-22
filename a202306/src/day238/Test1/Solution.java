package day238.Test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//面试题 16.19. 水域大小
class Solution {
    public int[] pondSizes(int[][] land) {
        int n = land.length, m = land[0].length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(land[i][j] == 0) list.add(dfs(land, i, j));
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        Arrays.sort(res);
        return res;
    }

    private int dfs(int[][] land, int x, int y) {
        if(x < 0 || x >= land.length || y < 0 || y >= land[0].length || land[x][y] != 0) return 0;
        land[x][y] = -1;
        int res = 1;
        for (int dx = -1; dx <= 1; dx++){
            for (int dy = -1; dy <= 1; dy++){
                if(dy == 0 && dx == 0) continue;
                res += dfs(land, x + dx, y + dy);
            }
        }
        return res;
    }
}
