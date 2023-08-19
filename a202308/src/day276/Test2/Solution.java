package day276.Test2;

//2224. 转化时间需要的最少操作数
class Solution {
    public int convertTime(String current, String correct) {
        String[] arr1 = current.split(":");
        String[] arr2 = correct.split(":");
        int res = 0, sum1 = 0, sum2 = 0;
        sum1 = 60 * (Integer.parseInt(arr2[0]) - Integer.parseInt(arr1[0]));
        sum2 = Integer.parseInt(arr2[1]) - Integer.parseInt(arr1[1]);
        int sum = sum1 + sum2;
        int[] num = {60, 15, 5, 1};
        for (int i = 0; i < 4; ++i){
            res += (sum / num[i]);
            sum %= num[i];
        }
        return res;
    }
}
