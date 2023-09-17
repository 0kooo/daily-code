package day293.Test2;

//504. 七进制数
class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        if(num < 0){
            num = -num;
            flag = true;
        }
        while (num != 0){
            sb.append(num % 7);
            num /= 7;
        }
        if(flag) sb.append("-");
        return sb.reverse().toString();
    }
}
