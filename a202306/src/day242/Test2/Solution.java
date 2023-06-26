package day242.Test2;

//540. 有序数组中的单一元素
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
