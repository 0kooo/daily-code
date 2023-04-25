package day192.Test2;

import java.util.Arrays;

//1079. 活字印刷
class Solution {
    int ans;
    char[] s;
    public int numTilePossibilities(String tiles) {
        s = tiles.toCharArray();
        Arrays.sort(s);
        boolean[] used = new boolean[s.length];
        DFS(used);
        return ans;
    }

    public void DFS(boolean[] used){
        char last = '*';
        for (int i = 0; i < s.length; i++) {
            if(!used[i] && s[i] != last){
                ans++;
                used[i] = true;
                DFS(used);
                used[i] = false;
                last = s[i];
            }
        }
    }
}