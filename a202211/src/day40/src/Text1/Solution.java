package Text1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int lens = s.length();
        int lenp = p.length();
        if(lens < lenp) return list;

        int[] countS = new int[26];
        int[] countP = new int[26];
        for (int i = 0; i < lenp; i++) {
            ++countS[(s.charAt(i) - 'a')];
            ++countP[(p.charAt(i) - 'a')];
        }
        if(Arrays.equals(countS,countP)){
            list.add(0);
        }
        for(int i = 0; i < lens - lenp; i++){
            --countS[s.charAt(i) - 'a'];
            ++countS[s.charAt(i + lenp) - 'a'];
            if(Arrays.equals(countS,countP)){
                list.add(i + 1);
            }
        }
        return list;
    }
}