package day382.Test1;

import java.util.Arrays;

//1483. 树节点的第 K 个祖先
class TreeAncestor {
    static final int N = 16;
    int[][] nums;
    public TreeAncestor(int n, int[] parent) {
        nums = new int[n][N];
        for (int i = 0; i < n; i++) {
            Arrays.fill(nums[i], -1);
        }
        for (int i = 0; i < n; i++){
            nums[i][0] = parent[i];
        }
        for (int j = 1; j < N; j++) {
            for (int i = 0; i < n; i++) {
                if(nums[i][j - 1] != -1){
                    nums[i][j] = nums[nums[i][i - 1]][j - 1];
                }
            }
        }
    }

    public int getKthAncestor(int node, int k) {
        for (int i = 0; i < N; i++) {
            if(((k >> i) & 1) != 0){
                node = nums[node][i];
                if (node == - 1) return -1;
            }
        }
        return node;
    }
}