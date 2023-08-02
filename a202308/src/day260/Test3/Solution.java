package day260.Test3;

import java.util.HashSet;
import java.util.Set;

//2670. 找出不同元素数目差数组
class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            for (int j = 0; j <= i; j++) set1.add(nums[j]);
            for (int j = i + 1; j < n; j++) set2.add(nums[j]);
            res[i] = set1.size() - set2.size();
        }
        return res;
    }
}