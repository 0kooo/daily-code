package day307.Test3;

//2278. 字母在字符串中的百分比
class Solution {
    public int percentageLetter(String s, char letter) {
        double count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == letter) count++;
        }
        return (int)((count / n) * 100);
    }
}
