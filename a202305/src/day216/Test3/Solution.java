package day216.Test3;

//2057. 值相等的最小索引
class Solution {
    public int smallestEqual(int[] nums) {
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            if(i % 10 == nums[i]){
                res = i;
                break;
            }
        }
        return res;
    }
}
