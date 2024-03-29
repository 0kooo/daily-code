package day321.Test2;

//769. 最多能完成排序的块
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max = 0, res = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if(max == i) res++;
        }
        return res;
    }
}
