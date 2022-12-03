package day58.Text3;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int secondHighest(String s) {
        int f = -1;
        int e = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int num = c - '0';
                if(num > f){
                    e = f;
                    f = num;
                }else if(num < f && num > e){
                    e = num;
                }
            }
        }
        return e;
    }
}
