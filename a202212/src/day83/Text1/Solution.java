package day83.Text1;

class Solution {
    public int minimumLength(String s) {
        int length = s.length();
        int left = 0;
        int right = length - 1;
        while(left < right && s.charAt(left) == s.charAt(right)){
            char c = s.charAt(left);
            while(left <= right && s.charAt(left) == c){
                left++;
            }
            while(left <= right && s.charAt(right) == c){
                right--;
            }
        }
        return right - left + 1;
    }
}
