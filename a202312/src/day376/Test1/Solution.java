package day376.Test1;

import java.util.ArrayList;
import java.util.List;

//LCR 079. 子集
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums, nums.length);
        return res;
    }

    private void dfs(int i, int[] nums, int n) {
        if(i >= n){
            res.add(new ArrayList<>(list));
            return;
        }else{
            list.add(nums[i]);
            dfs(i + 1, nums, n);
            list.remove(list.size() - 1);
            dfs(i + 1, nums, n);
        }
    }
}