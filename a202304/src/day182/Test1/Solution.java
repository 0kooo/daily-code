package day182.Test1;


import java.util.ArrayList;
import java.util.List;

//1042. 不邻接植花
class Solution {
    public int[] gardenNoAdj(int n, int[][] paths) {
        List<Integer>[] list = new List[n];
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }
        for (int[] path : paths) {
            list[path[0] - 1].add(path[1] - 1);
            list[path[1] - 1].add(path[0] - 1);
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            boolean[] colored = new boolean[5];
            for (int vertex : list[i]) {
                colored[res[vertex]] = true;
            }
            for (int j = 1; j <= 4; j++) {
                if(!colored[j]){
                    res[i] = j;
                    break;
                }
            }
        }
        return res;
    }
}
