package day325.day329.Test1;

import java.util.Arrays;

//1465. 切割后面积最大的蛋糕
class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        return (int)((long)getMax(horizontalCuts, h) * getMax(verticalCuts, w) % 1000000007);
    }

    private int getMax(int[] arr, int x) {
        int pre = 0, res = 0;
        for (int num : arr) {
            res = Math.max(num - pre, res);
            pre = num;
        }
        return Math.max(res, x - pre);
    }
}