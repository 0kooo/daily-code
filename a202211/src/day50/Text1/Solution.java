package day50.Text1;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int j = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[j] != nums[i]){
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }
}
