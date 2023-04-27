package day194.Test2;

import java.util.ArrayList;
import java.util.List;

//2248. 多个数组求交集
class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> res = new ArrayList<>();
        int[] arr = new int[1001];
        for (int[] num : nums) {
            for (int i : num) {
                arr[i]++;
            }
        }
        int n = nums.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n) res.add(i);
        }
        return res;
    }
}
