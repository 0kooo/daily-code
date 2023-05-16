package day212.Test2;

//747. 至少是其他数字两倍的最大数
class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
        int res = 0, max = 0;
        for (int i = 0; i < n; i++) {
            if(max < nums[i]){
                max = nums[i];
                res = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if(i == res) continue;
            if(nums[i] * 2 > max){
                res = -1;
                break;
            }
        }
        return res;
    }
}