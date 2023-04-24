package day191.Test1;

import java.util.HashSet;
import java.util.Set;

//2405. 子字符串的最优划分
class Solution {
    public int partitionString(String s) {
        int res = 1;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(set.contains(c)){
                res++;
                set.clear();
            }
            set.add(c);
        }
        return res;
    }
}
