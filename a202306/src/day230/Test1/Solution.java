package day230.Test1;

//1310. 子数组异或查询
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = queries.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int left = queries[i][0], right = queries[i][1];
            res[i] = arr[left];
            if(left == right) continue;
            for (int j = left + 1; j <= right; j++){
                res[i] ^= arr[j];
            }
        }
        return res;
    }
}
