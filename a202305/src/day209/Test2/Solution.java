package day209.Test2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//442. 数组中重复的数据
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            if(set.contains(num)){
                res.add(num);
            }
            set.add(num);
        }
        return res;
    }
}
