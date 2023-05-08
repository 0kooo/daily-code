package day203.Test1;

//1010. 总持续时间可被 60 整除的歌曲
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] arr = new int[60];
        for (int t : time) {
            arr[t % 60]++;
        }
        long res = 0;
        for (int i = 0; i < 30; i++) {
            res += arr[i] * arr[60 - i];
        }
        res += (long) arr[0] * (arr[0] - 1) / 2 + (long)arr[30] * (arr[30] - 1) / 2;
        return (int)res;
    }
}
