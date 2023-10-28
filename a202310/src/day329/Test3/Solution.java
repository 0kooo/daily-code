package day329.Test3;

import java.util.Arrays;

//2729. 判断一个数是否迷人
class Solution {
    public boolean isFascinating(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append(n * 2);
        sb.append(n * 3);
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[0] == '0') return false;
            if(arr[i + 1] - arr[i] != 1) return false;
        }
        return true;
    }
}
