package day228.Test1;

import java.util.Arrays;

//2611. 老鼠和奶酪
class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int res = 0;
        int n = reward1.length;
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            res += reward2[i];
            diff[i] = reward1[i] - reward2[i];
        }
        Arrays.sort(diff);
        for (int i = 1; i <= k; i++){
            res += diff[n - i];
        }
        return res;
    }
}
