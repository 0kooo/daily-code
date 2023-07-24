package day253.Test1;

import java.util.ArrayList;
import java.util.List;

//2200. 找出数组中的所有 K 近邻下标
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] == key){
                j = Math.max(j, i - k);
                int end = Math.min(i + k, n - 1);
                while (j <= end){
                    res.add(j++);
                }
            }
        }
        return res;
    }
}
