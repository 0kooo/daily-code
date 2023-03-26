package day162.Test1;

import java.util.HashSet;
import java.util.Set;

//2395. 和相等的子数组
class Solution {
    public boolean findSubarrays(int[] nums) {
        /*int n = nums.length;
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = nums[i] + nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if(arr[i] == arr[j]) return true;
            }
        }
        return false;*/

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i] + nums[i + 1];
            if(!set.add(sum)){
                return true;
            }
        }
        return false;
    }
}
