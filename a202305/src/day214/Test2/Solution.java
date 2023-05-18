package day214.Test2;

import java.util.Arrays;

//1619. 删除某些元素后的数组均值
class Solution {
    public double trimMean(int[] arr) {
        int sum = 0;
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = n / 20; i < 19 * n / 20; i++){
            sum += arr[i];
        }

        return sum / (0.9 * n);
    }
}