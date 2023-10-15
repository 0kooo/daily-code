package day317.Test3;

//2710. 移除字符串中的尾随零
class Solution {
    public String removeTrailingZeros(String num) {
        int index = num.length() - 1;
        while (index >= 0 && num.charAt(index) == '0'){
            index--;
        }
        return num.substring(0, index + 1);
    }
}
