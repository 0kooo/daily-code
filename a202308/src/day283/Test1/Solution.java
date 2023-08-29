package day283.Test1;

import java.util.Arrays;

//823. 带因子的二叉树
class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        long[] dp = new long[n];
        long res = 0, mod = 1000000007;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int l = 0, r = i - 1; l <= r; l++){
                while (r >= l && (long)arr[l] * arr[r] > arr[i]){
                    r--;
                }
                if(r >= l && (long) arr[l] * arr[r] == arr[i]){
                    if(r != l) dp[i] = (dp[i] + dp[l] * dp[r] * 2) % mod;
                    else dp[i] = (dp[i] + dp[l] * dp[r]) % mod;
                }
            }
            res = (res + dp[i]) % mod;
        }
        return (int)res;
    }
}
