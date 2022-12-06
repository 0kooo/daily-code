package day61.Text3;

import java.util.*;

class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        int n = word.length();
        int p1 = 0;
        int p2 = 0;
        while(true){
            while(p1 < n && !Character.isDigit(word.charAt(p1))){
                p1++;
            }
            if(p1 == n) break;
            p2 = p1;
            while(p2 < n && Character.isDigit(word.charAt(p2))){
                p2++;
            }
            while(p2 - p1 > 1 && word.charAt(p1) == '0'){
                p1++;
            }
            set.add(word.substring(p1, p2));
            p1 = p2;
        }
        return set.size();
    }
}
