package day333.Test2;

//592. 分数加减运算
class Solution {
    public String fractionAddition(String expression) {
        long x = 0, y = 1;
        int n = expression.length(), index = 0;
        while (index < n){
            long x1 = 0, sign = 1;
            if(expression.charAt(index) == '-' || expression.charAt(index) == '+'){
                sign = expression.charAt(index) == '-' ? -1 : 1;
                index++;
            }
            while (index < n && Character.isDigit(expression.charAt(index))){
                x1 = x1 * 10 + expression.charAt(index) - '0';
                index++;
            }
            x1 = sign * x1;
            index++;
            long y1 = 0;
            while (index < n && Character.isDigit(expression.charAt(index))){
                y1 = y1 * 10 + expression.charAt(index) - '0';
                index++;
            }
            x = x * y1 + x1 * y;
            y *= y1;
        }
        if(x == 0) return "0/1";
        long g = gcd(Math.abs(x), y);
        return Long.toString(x / g) + "/" + Long.toString(y / g);
    }

    private long gcd(long a, long b) {
        long remainder = a % b;
        while (remainder != 0){
            a = b;
            b = remainder;
            remainder = a % b;
        }
        return b;
    }
}
