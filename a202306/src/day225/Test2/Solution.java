package day225.Test2;

//1566. 重复至少 K 次且长度为 M 的模式
class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int n = arr.length, count = 0;
        if(m * k > n) return false;
        for (int i = 0; i <= n - m * k; i++) {
            int j;
            for (j = 0; j < m * k; j++){
                if(arr[j + i] != arr[i + j % m]){
                    break;
                }
            }
            if(j == m * k){
                return true;
            }
        }
        return false;
    }
}