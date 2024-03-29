package day234.Test1;

import java.util.ArrayDeque;
import java.util.Queue;

//1254. 统计封闭岛屿的数目
class Solution {
    static int[][] dir = {{-1, 0}, {1, 0}, {0, - 1}, {0, 1}};
    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == 0){
                    Queue<int[]> qu = new ArrayDeque<>();
                    grid[i][j] = 1;
                    boolean closed = true;
                    qu.offer(new int[]{i, j});
                    while (!qu.isEmpty()){
                        int[] arr = qu.poll();
                        int cx = arr[0], cy = arr[1];
                        if(cx == 0 || cy == 0 || cx == m - 1 || cy == n -1){
                            closed = false;
                        }
                        for (int d = 0; d < 4; d++){
                            int nx = cx + dir[d][0];
                            int ny = cy + dir[d][1];
                            if(nx >= 0 && nx < m && ny >= 0 && ny < n && grid[nx][ny] == 0){
                                grid[nx][ny] = 1;
                                qu.offer(new int[]{nx, ny});
                            }
                        }
                    }
                    if(closed) res++;
                }
            }
        }
        return res;
    }
}