package Text3;

class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int temp = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num = getValue(s.charAt(i));
            if(temp < num){
                sum -= temp;
            }else{
                sum += temp;
            }
            temp = num;
        }
        sum += temp;
        return sum;
    }

    public int getValue(char s){
        switch(s) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}