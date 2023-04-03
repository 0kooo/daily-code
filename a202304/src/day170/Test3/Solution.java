package day170.Test3;


//1122. 数组的相对排序
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int upper = 0;
        for (int x : arr1) {
            upper = Math.max(upper, x);
        }

        int[] frequency = new int[upper + 1];
        for (int x : arr1) {
            ++frequency[x];
        }
        int[] res = new int[arr1.length];
        int index = 0;
        for (int x : arr2) {
            for(int i = 0; i < frequency[x]; ++i){
                res[index++] = x;
            }
            frequency[x] = 0;
        }
        for(int x = 0; x <= upper; ++x){
            for(int i = 0; i < frequency[x]; ++i){
                res[index++] = x;
            }
        }
        return res;
    }
}
