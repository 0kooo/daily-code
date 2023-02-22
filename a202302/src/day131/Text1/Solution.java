package day131.Text1;

class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[c]++;
        }
        int res = 0;
        for (int i : arr) {
            res += i / 2 * 2;
            if(i % 2 == 1 && res % 2 == 0){
                res++;
            }
        }
        return res;
    }
}
