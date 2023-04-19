package day186.Test1;


//1043. 分隔数组以得到最大和
class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] res = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int max = arr[i - 1];
            for(int j = i - 1; j >= 0 && j >= i - k; j--){
                res[i] = Math.max(res[i], res[j] + max * (i - j));
                if(j > 0){
                    max = Math.max(max, arr[j - 1]);
                }
            }
        }
        return res[n];
    }
}
