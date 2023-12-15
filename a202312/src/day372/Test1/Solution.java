package day372.Test1;

import java.util.ArrayList;
import java.util.List;

//2161. 根据给定数字划分数组
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int count = 0;
        for (int num : nums) {
            if(num > pivot) list2.add(num);
            else if(num < pivot) list1.add(num);
            else count++;
        }
        int[] res = new int[nums.length];
        int index = 0;
        for (int i = 0; i < list1.size(); i++) {
            res[index] = list1.get(i);
            index++;
        }
        for (int i = 0; i < count; i++) {
            res[index] = pivot;
            index++;
        }
        for (int i = 0; i < list2.size(); i++) {
            res[index] = list2.get(i);
            index++;
        }
        return res;
    }
}
