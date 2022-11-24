package Text1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    //先排序,再查找
    /*public boolean containsDuplicate(int[] nums) {
        int l = nums.length;
        int count = 1;
        Arrays.sort(nums);
        for (int i = 0; i < l - 1; i++) {
            if(nums[i] == nums[i + 1]){
                count++;
            }
        }
        return count >= 2;
    }*/
    //哈希表
    public boolean containsDuplicate(int[] nums){
        int l = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
