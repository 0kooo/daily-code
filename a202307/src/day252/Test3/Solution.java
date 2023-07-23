package day252.Test3;

import java.util.Arrays;

//179. 最大数
class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder res = new StringBuilder();
        int n = nums.length;
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr, (a, b) -> {
            long sx = 10, sy = 10;
            while (sx <= a){
                sx *= 10;
            }
            while (sy <= b){
                sy *= 10;
            }
            return (int)(-sy * a - b + sx * b + a);
        });
        if(arr[0] == 0) return "0";
        for (int i = 0; i < n; i++) {
            res.append(arr[i]);
        }
        return res.toString();
    }
}
