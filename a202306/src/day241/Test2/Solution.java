package day241.Test2;

//1437. 是否所有 1 都至少相隔 k 个元素
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int pre = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                if(pre != -1 && i - pre - 1 < k){
                    return false;
                }
                pre = i;
            }
        }
        return true;
    }
}
