package day277.Test3;

import java.util.Arrays;

//646. 最长数对链
class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (o1, o2) -> o1[1] - o2[1]);
        int res = 1, per = pairs[0][1];
        for (int i = 0; i < pairs.length; i++) {
            if(per < pairs[i][0]) {
                per = pairs[i][1];
                res++;
            }
        }
        return res;
    }
}