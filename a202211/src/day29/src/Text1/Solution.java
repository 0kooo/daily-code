package Text1;

class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean head = true;
        boolean end = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i + 1]){
                head = false;
            }
            if(nums[i] < nums[i + 1]){
                end = false;
            }
        }
        return head || end;
    }
}
