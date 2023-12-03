package day365.Test1;

import java.util.Arrays;

//2545. 根据第 K 场考试的分数排序
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (a, b) -> b[k] - a[k]);
        return score;
    }
}