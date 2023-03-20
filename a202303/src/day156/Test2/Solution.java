package day156.Test2;

//541. 反转字符串 II
class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        char[] arr = s.toCharArray();
        for (int i = 0; i < n; i += k * 2) {
            swap(arr, i, Math.min(i + k, n) - 1);
        }
        return new String(arr);
    }

    public void swap(char[] arr, int left, int right){
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
