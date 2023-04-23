package day190.Test2;

import java.util.Arrays;

//2099. 找到和最大的长度为 K 的子序列
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = i;
            arr[i][1] = nums[i];
        }
        // 按照数值nums[idx]从大到小排序
        Arrays.sort(arr, (a, b) -> b[1] - a[1]);
        // 按照索引idx从小到大进行排列
        Arrays.sort(arr, 0, k, (a, b) -> a[0] - b[0]);
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = arr[i][1];
        }
        return res;
    }
}
