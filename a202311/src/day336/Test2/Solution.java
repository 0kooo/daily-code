package day336.Test2;

//647. 回文子串
class Solution {
    public int countSubstrings(String s) {
        int n = s.length(), res = 0;
        for (int i = 0; i < 2 * n - 1; i++){
            int l = i / 2, r = i / 2 + i % 2;
            while (l >= 0 && r < n && s.charAt(r) == s.charAt(l)){
                r++;
                l--;
                res++;
            }
        }
        return res;
    }
}
