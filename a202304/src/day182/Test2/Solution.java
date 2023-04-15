package day182.Test2;

//1763. 最长的美好子字符串
class Solution {
    public String longestNiceSubstring(String s) {
        int n = s.length();
        int maxPos = 0, maxLen = 0;
        for (int i = 0; i < n; i++) {
            int lower = 0, upper = 0;
            for(int j = i; j < n; ++j){
                if(Character.isLowerCase(s.charAt(j))){
                    lower |= 1 << (s.charAt(j) - 'a');
                }else{
                    upper |= 1 << (s.charAt(j) - 'A');
                }
                if(lower == upper && j - i + 1 > maxLen){
                    maxPos = i;
                    maxLen = j - i + 1;
                }
            }
        }
        return s.substring(maxPos, maxPos + maxLen);
    }
}