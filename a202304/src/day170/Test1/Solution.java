package day170.Test1;


//1053. 交换一次的先前排列
class Solution {
    public int[] prevPermOpt1(int[] arr) {
        int n = arr.length;
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] > arr[i + 1]){
                int j = n - 1;
                while (arr[j] >= arr[i] || arr[j] == arr[j - 1]){
                    j--;
                }
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                break;
            }
        }
        return arr;
    }
}
