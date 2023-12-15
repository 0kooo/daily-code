package day372.Test3;

import java.util.List;

//2855. 使数组成为递增数组的最少右移次数
class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n = nums.size(), i = 0;
        while (i < n - 1 && nums.get(i) < nums.get(i + 1)){
            i++;
        }
        if(i == n - 1) return 0;
        if(nums.get(n - 1) > nums.get(0)) return -1;
        ++i;
        int j = i;
        while (i < n - 1 && nums.get(i) < nums.get(i + 1)) {
            ++i;
        }
        if(i == n - 1) return n - j;
        return -1;
    }
}