package day341.Test1;

//2609. 最长平衡子字符串
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int res = 0;
        for (int i = 0; i < s.length();) {
            int count1 = 0, count0 = 0;
            while (i < s.length() && s.charAt(i) == '0') {
                count0++;
                i++;
            }
            while (i < s.length() && s.charAt(i) == '1') {
                count1++;
                i++;
            }
            if(count1 < count0) count0 = count1;
            else if(count1 > count0) count1 = count0;
            res = Math.max(count0 + count1, res);
        }
        return res;
    }
}