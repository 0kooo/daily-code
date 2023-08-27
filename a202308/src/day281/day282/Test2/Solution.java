package day281.day282.Test2;

//2697. 字典序最小回文串
class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0, n = arr.length; i < n / 2; i++) {
            char x = arr[i], y = arr[n - 1 -i];
            if(x > y) arr[i] = y;
            else arr[n - 1 - i] = x;
        }
        return new String(arr);
    }
}