package day53.Text2;

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        /*for (int i = 1; i < arr.length - 1; i++) {
            if(arr[i - 1] < arr[i] && arr[i] < arr[i + 1]){
                return i;
            }
        }
        return 0;*/
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int mid = (left + right) + 1 >> 1;
            if(arr[mid - 1] < arr[mid]){
                left = mid;
            }else {
                right = mid - 1;
            }
        }
        return left;
    }
}
