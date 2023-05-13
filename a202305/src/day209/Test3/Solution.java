package day209.Test3;

//845. 数组中的最长山脉
class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int res = 0, left = 0;
        while (left + 2 < n){
            int right = left + 1;
            if(arr[left] < arr[left + 1]){
                while (right + 1 < n && arr[right] < arr[right + 1]){
                    right++;
                }
                if(right < n - 1 && arr[right] > arr[right + 1]){
                    while (right + 1 < n && arr[right] > arr[right + 1]){
                        right++;
                    }
                    res = Math.max(res, right - left + 1);
                }else{
                    ++right;
                }
            }
            left = right;
        }
        return res;
    }
}
