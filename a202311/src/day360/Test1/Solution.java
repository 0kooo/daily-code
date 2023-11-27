package day360.Test1;

import java.util.ArrayDeque;
import java.util.Deque;

//907. 子数组的最小值之和
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long res = 0;
        final int MOD = 1000000007;
        int[] dp = new int[n];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && arr[deque.peek()] > arr[i]){
                deque.pop();
            }
            int k = deque.isEmpty() ? (i + 1) : (i - deque.peek());
            dp[i] = k * arr[i] + (deque.isEmpty() ? 0 : dp[i - k]);
            res = (res + dp[i]) % MOD;
            deque.push(i);
        }
        return (int) res;
    }
}