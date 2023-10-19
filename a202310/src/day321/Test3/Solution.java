package day321.Test3;

//941. 有效的山脉数组
class Solution {
    public boolean validMountainArray(int[] arr) {
        int i = 0, n = arr.length;
        while (i < n - 1 && arr[i] < arr[i + 1])i++;
        if(i == 0 || i == n - 1) return false;
        while (i < n - 1 && arr[i] > arr[i + 1])i++;
        return i == n - 1;
    }
}
