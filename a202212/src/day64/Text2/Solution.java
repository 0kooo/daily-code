package day64.Text2;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longSet = 0;

        for (Integer num : set) {
            if(!set.contains(num - 1)){
                int curNum = num;
                int curStreak = 1;

                while(set.contains(curNum + 1)){
                    curNum += 1;
                    curStreak += 1;
                }
                longSet = Math.max(longSet, curStreak);
            }
        }
        return longSet;
    }
}
