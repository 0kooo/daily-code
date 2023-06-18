package day235.Test2;

//1299. 将每个元素替换为右侧最大元素
class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i < n - 1; i++) {
            res[i] = getMax(arr, i + 1);
        }
        res[n - 1] = -1;
        return res;
    }

    private int getMax(int[] arr, int i) {
        int max = Integer.MIN_VALUE;
        for (int j = i; j < arr.length; j++) {
            max = Math.max(max, arr[j]);
        }
        return max;
    }
}