package day84.Text1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> res = new ArrayList<>();
        for (int n1 : nums1) {
            for (int n2 : nums2) {
                if(n1 == n2){
                    if(!res.contains(n1)){
                        res.add(n1);
                    }
                }
            }
        }
        for (int n1 : nums1) {
            for (int n3 : nums3) {
                if(n1 == n3){
                    if(!res.contains(n1)){
                        res.add(n1);
                    }
                }
            }
        }
        for (int n2 : nums2) {
            for (int n3 : nums3) {
                if(n2 == n3){
                    if(!res.contains(n2)){
                        res.add(n2);
                    }
                }
            }
        }
        return res;
    }
}
