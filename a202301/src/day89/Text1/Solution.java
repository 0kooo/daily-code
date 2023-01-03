package day89.Text1;


class Solution {
    public boolean areNumbersAscending(String s) {
        int pre = 0;
        int count = 0;
        while(count < s.length()){
            if(Character.isDigit(s.charAt(count))){
                int temp = 0;
                while(count < s.length() && Character.isDigit(s.charAt(count))){
                    temp = temp * 10 + s.charAt(count) - '0';
                    count++;
                }
                if(temp <= pre){
                    return false;
                }
                pre = temp;
            }else{
                count++;
            }
        }
        return true;
    }
}
