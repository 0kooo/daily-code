package day195.Test2;

import java.util.HashSet;
import java.util.Set;

//2441. 与对应负数同时存在的最大正整数
class Solution {
    public int findMaxK(int[] nums) {
        int res = -1;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(num > 0){
                if(set.contains(-num)){
                    res = Math.max(res, num);
                }
            }else{
                if(set.contains(Math.abs(num))){
                    res = Math.max(res, Math.abs(num));
                }
            }
            set.add(num);
        }
        return res;
    }
}
