package day227.Test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//2164. 对奇偶下标分别排序
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if((i&1) == 1) list1.add(nums[i]);
            else list2.add(nums[i]);
        }
        Collections.sort(list2);
        Collections.sort(list1, (a, b) -> b - a);
        for (int i = 0; i < list2.size(); i++) {
            nums[2*i] = list2.get(i);
        }
        for (int i = 0; i < list1.size(); i++) {
            nums[2*i+1] = list1.get(i);
        }
        return nums;
    }
}
