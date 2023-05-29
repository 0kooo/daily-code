package day222.Test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//2089. 找出数组排序后的目标下标
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                res.add(i);
            }
        }
        return res;
    }
}