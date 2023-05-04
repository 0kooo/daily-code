package day200.Test1;

//921. 使括号有效的最少添加
class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') count++;
            if(c == ')'){
                if(count > 0) count--;
                else res++;
            }
        }
        return res + count;
    }
}
