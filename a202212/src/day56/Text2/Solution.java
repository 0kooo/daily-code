package day56.Text2;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = dfs(nums, target, true);
        int right = dfs(nums, target, false) - 1;
        if(left <= right && right < nums.length && nums[left] == target && nums[right] == target){
            return new int[]{left, right};
        }
        return new int[]{-1, -1};
    }

    public int dfs(int[] nums, int target, boolean low){
        int left = 0;
        int right = nums.length - 1;
        int res = nums.length;
        while(left <= right){
            int mid = left + ((right - left) >> 1);
            if(nums[mid] > target || (low && nums[mid] >= target)){
                right = mid - 1;
                res = mid;
            }else{
                left = mid + 1;
            }
        }
        return res;
    }
}
