package day192.Test3;

//2190. 数组中紧跟 key 之后出现最频繁的数字
class Solution {
    public int mostFrequent(int[] nums, int key) {
        int n = nums.length;
        int res = 0, max = 0;
        int[] arr = new int[1001];
        for (int i = 0; i < n; i++) {
            if(nums[i] == key && ++arr[nums[i + 1]] > max){
                max = arr[nums[i + 1]];
                res = nums[i + 1];
            }
        }
        return res;
    }
}
