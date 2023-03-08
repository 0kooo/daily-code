package day144.Test3;

class Solution {
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'A'){
                ++countA;
                if(countA >= 2) return false;
            }
            if(c == 'L'){
                countL++;
                if(countL >= 3) return false;
            }else{
                countL = 0;
            }
        }
        return true;
    }
}
