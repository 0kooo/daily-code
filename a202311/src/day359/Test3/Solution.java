package day359.Test3;

//2696. 删除子串后的字符串最小长度
class Solution {
    public int minLength(String s) {
        int length = s.length();
        char[] stack = new char[length];
        int index = -1;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if(c == 'B'){
                if(index >= 0 && stack[index] == 'A') index--;
                else stack[++index] = c;
            }else if(c == 'D'){
                if(index >= 0 && stack[index] == 'C') index--;
                else stack[++index] = c;
            }else stack[++index] = c;
        }
        return index + 1;
    }
}