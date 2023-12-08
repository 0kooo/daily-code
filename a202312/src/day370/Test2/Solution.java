package day370.Test2;

import java.util.ArrayList;
import java.util.List;

//2610. 转换二维数组
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        while (true){
            List<Integer> list = new ArrayList<>();
            boolean flag = true;
            for (int i = 0; i < nums.length; i++) {
                if(list.contains(nums[i]) || nums[i] == 0) continue;
                else {
                    flag = false;
                    list.add(nums[i]);
                    nums[i] = 0;
                }
            }
            if(flag) break;
            res.add(list);
        }
        return res;
    }
}