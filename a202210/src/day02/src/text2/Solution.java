package text2;

import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int l = nums.length;
        if(l == 0){
            return 0;
        }
        int temp = 1;
        int move = 1;
        while(move < l){
            if(nums[move] != nums[move - 1]){
                nums[temp] = nums[move];
                temp++;
            }
            move++;
        }
        return temp;
    }
}
