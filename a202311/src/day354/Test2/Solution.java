package day354.Test2;

//1186. 删除一次得到子数组最大和
class Solution {
    public int maximumSum(int[] arr) {
        int dp0 = arr[0], dp1 = 0, res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            dp1 = Math.max(dp1 + arr[i], dp0);
            dp0 = Math.max(dp0, 0) + arr[i];
            res = Math.max(res, Math.max(dp1, dp0));
        }
        return res;
    }
}
