package day197.Test2;

import java.util.HashSet;
import java.util.Set;

//2475. 数组中不等三元组的数目
class Solution {
    public int unequalTriplets(int[] nums) {
        Set<int[]> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if(nums[i] != nums[j] && nums[j] != nums[k] && nums[i] != nums[k]){
                        set.add(new int[]{i, j, k});
                    }
                }
            }
        }
        return set.size();
    }
}
