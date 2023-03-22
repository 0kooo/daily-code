package day158.Test1;

import java.util.Arrays;

//1626. 无矛盾的最佳球队
class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        int res = 0;
        int n = scores.length;
        int[][] people = new int[n][2];
        for (int i = 0; i < n; i++) {
            people[i] = new int[]{scores[i], ages[i]};
        }
        Arrays.sort(people, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0; --j) {
                if(people[j][1] <= people[i][1]){
                    temp[i] = Math.max(temp[i], temp[j]);
                }
            }
            temp[i] += people[i][0];
            res = Math.max(res, temp[i]);
        }
        return res;
    }
}
