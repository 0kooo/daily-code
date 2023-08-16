package day273.Test2;

import java.util.Arrays;

//2160. 拆分数位后四位数字的最小和
class Solution {
    public int minimumSum(int num) {
        String str = String.valueOf(num);
        int n = str.length();
        int[] arr = new int[str.length()];
        for (int i = 0; i < n; i++) {
            arr[i] = str.charAt(i) - '0';
        }
        Arrays.sort(arr);
        return  (arr[0] * 10 + arr[2]) + (arr[1] * 10 + arr[3]);
    }
}