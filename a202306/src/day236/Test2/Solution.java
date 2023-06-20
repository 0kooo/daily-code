package day236.Test2;

//2496. 数组中字符串的最大值
class Solution {
    public int maximumValue(String[] strs) {
        int res = 0;
        for (String str : strs) {
            int n = str.length();
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                flag &= Character.isDigit(str.charAt(i));
            }
            res = Math.max(res, flag ? Integer.parseInt(str) : n);
        }
        return res;
    }
}