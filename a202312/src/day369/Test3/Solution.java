package day369.Test3;

import java.util.List;

//2848. 与车相交的点
class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] arr = new int[101];
        for (List<Integer> num : nums) {
            for (int i = num.get(0); i <= num.get(1); i++) arr[i]++;
        }
        int res = 0;
        for (int i = 1; i <= 100; i++) if(arr[i] > 0) res++;
        return res;
    }
}