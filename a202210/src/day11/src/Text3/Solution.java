package Text3;

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int lg = g.length;
        int ls = s.length;
        int i = 0;
        int j = 0;
        while(i < lg && j < ls){
            if(g[i] <= s[j]){
                i++;
            }
            j++;
        }
        return i;
    }
}
