package day279.Test3;

import java.util.Arrays;

//2578. 最小和分割
class Solution {
    public int splitNum(int num) {
        int num1 = 0, num2 = 0;
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            if(i % 2 == 0){
                num1 *= 10;
                num1 += (chars[i] - '0');
            }else{
                num2 *= 10;
                num2 += (chars[i] - '0');
            }
        }
        return num1 + num2;
    }
}