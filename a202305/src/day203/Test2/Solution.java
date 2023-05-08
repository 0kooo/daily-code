package day203.Test2;

import java.util.ArrayList;
import java.util.List;

//228. 汇总区间
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int i = 0;
        int n = nums.length;
        while (i < n){
            int left = i;
            i++;
            while (i < n && nums[i] == nums[i - 1] + 1){
                i++;
            }
            int right = i - 1;
            String temp = "" + nums[left];
            if(left < right){
                temp += "->";
                temp += nums[right];
            }
            res.add(temp);
        }
        return res;
    }
}
