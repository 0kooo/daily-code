package day226.Test2;

import java.util.Arrays;

//1423. 可获得的最大点数
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0, w = n - k;
        for (int i = 0; i < w; i++) {
            sum += cardPoints[i];
        }
        int min = sum;
        for (int i = w; i < n ; i++){
            sum += cardPoints[i] - cardPoints[i - w];
            min = Math.min(min, sum);
        }
        return Arrays.stream(cardPoints).sum() - min;
    }
}