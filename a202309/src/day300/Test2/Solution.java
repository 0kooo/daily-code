package day300.Test2;

//2119. 反转两次的数字
class Solution {
    public boolean isSameAfterReversals(int num) {
        String s = String.valueOf(num);
        if(num == 0)return true;
        return !(s.charAt(s.length() - 1) == '0');
    }
}
