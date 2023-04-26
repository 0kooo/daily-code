package day193.Test3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//2215. 找出两数组的不同
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }
        List<Integer> list1 = new ArrayList<>();
        for (int key : set1) {
            if(!set2.contains(key)){
                list1.add(key);
            }
        }
        List<Integer> list2 = new ArrayList<>();
        for (int key : set2) {
            if(!set1.contains(key)){
                list2.add(key);
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        return res;
    }
}
