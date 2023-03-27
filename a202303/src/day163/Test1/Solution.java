package day163.Test1;

//1638. 统计只差一个字符的子串数目
class Solution {
    public int countSubstrings(String s, String t) {
        int res = 0;
        int n = s.length();
        int m = t.length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int count = 0;
                for(int k = 0; i + k < n && j + k < m; k++){
                    count += s.charAt(i + k) == t.charAt(j + k) ? 0 : 1;
                    if(count > 1) break;
                    else if(count == 1) res++;
                }
            }
        }
        return res;
    }
}
/*
* class Solution {
    public int countSubstrings(String S, String T) {
        char[] s = S.toCharArray(), t = T.toCharArray();
        int ans = 0, n = s.length, m = t.length;
        for (int d = 1 - m; d < n; ++d) { // d=i-j, j=i-d
            int i = Math.max(d, 0);
            for (int k0 = i - 1, k1 = k0; i < n && i - d < m; ++i) {
                if (s[i] != t[i - d]) {
                    k0 = k1; // 上上一个不同
                    k1 = i;  // 上一个不同
                }
                ans += k1 - k0;
            }
        }
        return ans;
    }
}
* */