package day225.Test3;

import java.util.Arrays;

//1732. 找到最高海拔
class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        for (int i = 1; i < n + 1; i++) {
            arr[i] = gain[i - 1] + arr[i - 1];
        }
        Arrays.sort(arr);
        return arr[n];
    }
}
