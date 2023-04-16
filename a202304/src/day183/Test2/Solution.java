package day183.Test2;

//1893. 检查是否区域内所有整数都被覆盖
class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int n = ranges.length;
        int[] arr = new int[51];
        for (int i = 0; i < n; i++) {
            for(int j = ranges[i][0]; j <= ranges[i][1]; j++){
                arr[j]++;
            }
        }
        for(int i = left; i <= right; i++){
            if(arr[i] == 0){
                return false;
            }
        }
        return true;
    }
}
