package day333.Test1;

import java.util.*;

//2003. 每棵子树内缺失的最小基因值
class Solution {
    public int[] smallestMissingValueSubtree(int[] parents, int[] nums) {
        int n = parents.length;
        int[] res = new int[n];
        Arrays.fill(res, 1);
        int node = -1;
        for (int i = 0; i < n; i++) {
            if(nums[i] == 1) {
                node = i;
                break;
            }
        }
        if(node < 0) return res;
        List<Integer>[] g = new ArrayList[n];
        Arrays.setAll(g, e -> new ArrayList<>());
        for (int i = 1; i < n; i++) {
            g[parents[i]].add(i);
        }
        Set<Integer> vis = new HashSet<>();
        int mex = 2;
        while (node >= 0){
            dfs(node, g, vis, nums);
            while (vis.contains(mex)){
                mex++;
            }
            res[node] = mex;
            node = parents[node];
        }
        return res;
    }

    private void dfs(int x, List<Integer>[] g, Set<Integer> vis, int[] nums) {
        vis.add(nums[x]);
        for (int son : g[x]) {
            if (!vis.contains(nums[son])) {
                dfs(son, g, vis, nums);
            }
        }
    }
}
