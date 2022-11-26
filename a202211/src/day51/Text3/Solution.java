package day51.Text3;

import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        byte[] bytes = s.getBytes();
        ArrayList<Character> list = new ArrayList<>();
        for (byte aByte : bytes) {
            if((aByte >= 97 && aByte <= 122) || (aByte >= 48 && aByte <= 57)){
                list.add((char)aByte);
            }
        }
        int len = list.size();
        int i = 0;
        int j = len- 1;
        for(; i < len / 2;){
            if(list.get(i) != list.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
