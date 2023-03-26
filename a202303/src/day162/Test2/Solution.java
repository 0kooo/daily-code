package day162.Test2;

//2108. 找出数组中的第一个回文字符串
class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if(isPalindrome(word)){
                return word;
            }
        }
        return "";
    }

    public boolean isPalindrome(String s){
        int left = 0, right = s.length() - 1;
        while(left < right){
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);
            if(c1 != c2) return false;
            left++;
            right--;
        }
        return true;
    }
}
