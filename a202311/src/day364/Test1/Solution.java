package day364.Test1;

//1094. 拼车
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int maxTo = 0;
        for (int[] trip : trips) {
            maxTo = Math.max(maxTo, trip[2]);
        }
        int[] arr = new int[maxTo + 1];
        for (int[] trip : trips) {
            arr[trip[1]] += trip[0];
            arr[trip[2]] -= trip[0];
        }
        int count = 0;
        for (int i = 0; i <= maxTo; i++) {
            count += arr[i];
            if(count > capacity) return false;
        }
        return true;
    }
}