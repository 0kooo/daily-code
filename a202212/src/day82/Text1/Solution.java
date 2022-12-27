package day82.Text1;

class Solution {
    public int minimumMoves(String s) {
        int temp = -1;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'X' && i > temp){
                res++;
                temp = i + 2;
            }
        }
        return res;
    }
}
