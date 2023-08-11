package day268.Test3;

import java.util.Arrays;

//135. 分发糖果
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            if(ratings[i - 1] < ratings[i]) {
                arr[i] = arr[i - 1] + 1;
            }
        }
        for (int i = n - 1; i > 0; i--) {
            if(ratings[i] < ratings[i - 1]){
                arr[i - 1] = Math.max(arr[i - 1], arr[i] + 1);
            }
        }

        return Arrays.stream(arr).sum();
    }
}
