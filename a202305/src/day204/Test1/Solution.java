package day204.Test1;

import java.util.HashSet;
import java.util.Set;

//260. 只出现一次的数字 III
class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        int[] res =  new int[set.size()];
        int index = 0;
        for (int key : set) {
            res[index++] = key;
        }
        return res;
    }
}
