package day372.Test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//LCR 083. 全排列
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        dfs(nums.length, list, res, 0);
        return res;
    }

    private void dfs(int n, List<Integer> list, List<List<Integer>> res, int first) {
        if(n == first) res.add(new ArrayList<>(list));
        for (int i = first; i < n; i++){
            Collections.swap(list, first, i);
            dfs(n, list, res, first + 1);
            Collections.swap(list, first, i);
        }
    }
}