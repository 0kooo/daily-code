package day160.Test2;

//1089. 复写零
class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int top = 0;
        int i = -1;
        while(top < n){
            i++;
            if(arr[i] != 0){
                top++;
            }else{
                top += 2;
            }
        }
        int j = n - 1;
        if(top == n + 1){
            arr[j] = 0;
            j--;
            i--;
        }
        while(j >= 0){
            arr[j] = arr[i];
            j--;
            if(arr[i] == 0){
                arr[j] = arr[i];
                j--;
            }
            i--;
        }
    }
}