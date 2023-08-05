package day263.Test3;

//2717. 半有序排列
class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int l1 = 0, l2 = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            if(nums[i] == 1) l1 = i;
            else if(nums[i] == n) l2 = i;
        }
        return l1 + n - 1 - l2 - (l1 > l2 ? 1 : 0);
    }
}