package day107.Text1;

class Solution {
    public int countAsterisks(String s) {
        int res = 0;
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '|'){
                temp++;
                continue;
            }
            if(temp % 2 == 0 && c == '*') res++;
        }
        return res;
    }
}
