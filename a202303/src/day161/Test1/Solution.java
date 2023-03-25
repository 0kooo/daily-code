package day161.Test1;

//1574. 删除最短的子数组使剩余数组有序
class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int j = n - 1;
        int res = 0;
        while(j > 0 && arr[j] >= arr[j - 1]){
            j--;
        }
        if(j == 0) return 0;
        res = j;
        for (int i = 0; i < n; i++) {
            while(j < n && arr[j] < arr[i] ){
                j++;
            }
            res = Math.min(res, j - i - 1);
            if(i + 1 < n && arr[i] > arr[i + 1]){
                break;
            }
        }
        return res;
    }
}
