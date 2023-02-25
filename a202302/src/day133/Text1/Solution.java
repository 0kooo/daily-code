package day133.Text1;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> res = new HashSet<>();
        for (int num : nums) {
            if(num > 0){
                res.add(num);
            }
        }
        return res.size();
    }
}
