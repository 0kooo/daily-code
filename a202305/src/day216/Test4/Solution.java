package day216.Test4;

import java.util.ArrayList;
import java.util.List;

//969. 煎饼排序
class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int n = arr.length; n > 1; n--){
            int index = 0;
            for (int i = 0; i < n; i++){
                if(arr[i] > arr[index]){
                    index = i;
                }
            }
            if(index == n -1){
                continue;
            }
            reverse(arr, index);
            reverse(arr, n - 1);
            list.add(index + 1);
            list.add(n);
        }
        return list;
    }

    private void reverse(int[] arr, int end) {
        for(int i = 0, j = end; i < j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
