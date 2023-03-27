package day163.Test3;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//2465. 不同的平均值数目
class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> set = new HashSet<>();
        int left = 0, right = nums.length - 1;
        while (left < right){
            set.add((nums[left] + nums[right]) / 2.0);
            left++;
            right--;
        }
        return set.size();
    }
}
