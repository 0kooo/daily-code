package day247.Test3;

//1909. 删除一个元素使数组严格递增
class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int n = nums.length, count = 0, last = nums[0];
        for (int i = 1; i < n; i++) {
            if(nums[i] <= last){
                ++count;
                if(i > 1 && nums[i] <= nums[i - 2]){
                    last = nums[i - 1];
                    continue;
                }
            }
            last = nums[i];
        }
        return count <= 1;
    }
}
