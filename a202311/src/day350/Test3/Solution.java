package day350.Test3;

//1704. 判断字符串的两半是否相似
class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;
        String h = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(h.indexOf(c) >= 0){
                if(i < s.length() / 2) count++;
                else count--;
            }
        }
        return count == 0;
    }
}