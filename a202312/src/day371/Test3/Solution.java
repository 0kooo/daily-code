package day371.Test3;

import java.util.List;

//2859. 计算 K 置位下标对应元素的和
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int res = 0;
        int size = nums.size();
        for (int i = 0; i < size; i++){
            int count = Integer.bitCount(i);
            if(count == k){
                res += nums.get(i);
            }
        }
        return res;
    }
}