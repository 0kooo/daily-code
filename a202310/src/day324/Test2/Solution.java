package day324.Test2;

import java.util.ArrayList;
import java.util.List;

//491. 递增子序列
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        dfs(0, Integer.MIN_VALUE, nums);
        return res;
    }

    private void dfs(int cur, int last, int[] nums) {
        if(cur == nums.length) {
            if(temp.size() >= 2) res.add(new ArrayList<>(temp));
            return;
        }
        if(nums[cur] >= last){
            temp.add(nums[cur]);
            dfs(cur + 1, nums[cur], nums);
            temp.remove(temp.size() - 1);
        }
        if(nums[cur] != last) dfs(cur + 1, last, nums);
    }
}
