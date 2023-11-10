package day343.Test3;

//1422. 分割字符串的最大得分
class Solution {
    public int maxScore(String s) {
        int res = 0, n = s.length();
        for (int i = 1; i < n; i++) {
            int count = 0;
            String sub1 = s.substring(0, i);
            String sub2 = s.substring(i, n);
            for (int j = 0; j < i; j++) if(sub1.charAt(j) == '0') count++;
            for (int j = 0; j < n - i; j++) if(sub2.charAt(j) == '1') count++;
            res = Math.max(res, count);
        }
        return res;
    }
}