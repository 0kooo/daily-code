package day316.Test3;

//1869. 哪种连续子字符串更长
class Solution {
    public boolean checkZeroOnes(String s) {
        int count = 0, max0 = 0,max1 = 0, i = 0;
        while (true){
            while (i < s.length() && s.charAt(i) == '0') {
                i++;
                count++;
            }
            max0 = Math.max(max0, count);
            count = 0;
            while (i < s.length() && s.charAt(i) == '1'){
                i++;
                count++;
            }
            max1 = Math.max(max1, count);
            count = 0;
            if(i == s.length()) break;
        }
        return max0 < max1;
    }
}