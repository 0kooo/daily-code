package day151.Test1;

class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        boolean[][] connect = new boolean[n][n];
        int[] degree = new int[n];
        for(int[] v : roads){
            connect[v[0]][v[1]] = true;
            connect[v[1]][v[0]] = true;
            degree[v[0]]++;
            degree[v[1]]++;
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int rank = degree[i] + degree[j] - (connect[i][j] ? 1 : 0);
                max = Math.max(max, rank);
            }
        }
        return max;
    }
}
