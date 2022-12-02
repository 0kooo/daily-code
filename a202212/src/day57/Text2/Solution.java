package day57.Text2;

class Solution {
    /*public int findKthPositive(int[] arr, int k) {
        int length = arr.length;
        int[] res = new int[k + 1];
        int l = 0;
        for (int i = 1; i < length + k + 1; i++) {
            boolean flag = true;
            for (int j = 0; j < length; j++) {
                if(arr[j] == i){
                    flag = false;
                    break;
                }
            }
            if(l == k){
                break;
            }
            if(flag) res[l++] = i;
        }
        return res[k - 1];
    }*/

    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] - i - 1 >= k) {
                return k + i;
            }
        }
        return k + n;
    }

}
