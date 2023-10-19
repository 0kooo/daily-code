package day321.Test5;

//1446. 连续字符
class Solution {
    public int maxPower(String s) {
        int res = 1, i = 0, n = s.length();
        while (i < n - 1){
            int tmp = 1;
            while (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                tmp++;
            }
            i++;
            res = Math.max(tmp, res);
        }
        return res;
    }
}