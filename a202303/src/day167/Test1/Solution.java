package day167.Test1;

import java.util.HashSet;
import java.util.Set;

//2367. 算术三元组的数目
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int res = 0;
        for (int num : nums) {
            if(set.contains(num + diff) && set.contains(num + diff * 2)){
                res++;
            }
        }
        return res;
    }
}
