package day246.Test3;

//1854. 人口最多的年份
class Solution {
    public int maximumPopulation(int[][] logs) {
        int offset = 1950;
        int[] dealt = new int[102];
        for (int i = 0; i < logs.length; i++) {
            dealt[logs[i][0] - offset]++;
            dealt[logs[i][1] - offset]--;
        }
        int count = 0, maxCount = 0, res =0;
        for (int i = 0; i < dealt.length; i++) {
            count += dealt[i];
            if(count > maxCount) {
                maxCount = count;
                res = i + offset;
            }
        }
        return res;
    }
}
