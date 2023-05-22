package day218.Test4;

import java.util.Arrays;

//204. 计数质数
class Solution {
    public int countPrimes(int n) {
        int res = 0;
        int[] arr = new int[n];
        Arrays.fill(arr, 1);
        for(int i = 2; i < n; i++){
            if(arr[i] == 1){
                res++;
                if((long) i * i < n){
                    for(int j = i * i; j < n; j += i){
                        arr[j] = 0;
                    }
                }
            }
        }
        return res;
    }
}
