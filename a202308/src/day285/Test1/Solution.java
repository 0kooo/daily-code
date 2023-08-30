package day285.Test1;

//1761. 一个图中连通三元组的最小度数
class Solution {
    public int minTrioDegree(int n, int[][] edges) {
        int[][] g = new int[n][n];
        int[] degree = new int[n];
        for (int[] edge : edges) {
            int x = edge[0] - 1, y = edge[1] - 1;
            g[x][y] = g[y][x] = 1;
            ++degree[x];
            ++degree[y];
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(g[i][j] == 1){
                    for (int k = j + 1; k < n; k++) {
                        if(g[i][k] == 1 && g[j][k] == 1){
                            res = Math.min(res, degree[i] + degree[j] + degree[k] - 6);
                        }
                    }
                }
            }
        }
        return res;
    }
}
