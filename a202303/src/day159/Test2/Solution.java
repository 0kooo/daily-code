package day159.Test2;

//942. 增减字符串匹配
class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] res = new int[n + 1];
        int left = 0, right = n;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            res[i] = c == 'I' ? left++ : right--;
        }
        res[n] = left;
        return res;
    }
}
