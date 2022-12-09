package day63.Text2;

class Solution {
    public boolean squareIsWhite(String coordinates) {
        char m = coordinates.charAt(0);
        char n = coordinates.charAt(1);
        int num = Integer.parseInt(String.valueOf(n));
        if((m % 2 == 1 && num % 2 == 0) || (m % 2 == 0 && num % 2 == 1)){
            return false;
        }else{
            return true;
        }
    }
}
