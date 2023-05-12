package day208.Test2;

import java.util.Arrays;

//1051. 高度检查器
class Solution {
    public int heightChecker(int[] heights) {
        int res = 0, n = heights.length;
        int[] arr = new int[n];
        System.arraycopy(heights, 0, arr, 0, n);
        Arrays.sort(heights);
        for (int i = 0; i < n; i++) {
            if(heights[i] != arr[i])res++;
        }
        return res;
    }
}
